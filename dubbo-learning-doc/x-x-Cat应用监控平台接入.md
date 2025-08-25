### Cat接入

（1）添加Cat依赖： 修改文件：/home/daoen/github/czwer_dubbo/dubbo-rpc/dubbo-rpc-api/pom.xml

    <dependency>
        <groupId>com.dianping.cat</groupId>
        <artifactId>cat-core</artifactId>
        <version>1.3.3</version>
    </dependency>


（2）嵌入Cat代码：

（2.1）com.alibaba.dubbo.rpc.protocol.AbstractInvoker.invoke()方法调整：

    Transaction transaction = Cat.newTransaction("Invoke",invocation.getInvoker().getInterface().getSimpleName() + "." + invocation.getMethodName());
    try {
        Result result = doInvoke(invocation);
        transaction.setStatus(Transaction.SUCCESS);
        return result;
    } catch (InvocationTargetException e) { // biz exception
        Throwable te = e.getTargetException();
        Cat.getProducer().logError(e);
        transaction.setStatus(e);
        if (te == null) {
            return new RpcResult(e);
        } else {
            if (te instanceof RpcException) {
                ((RpcException) te).setCode(RpcException.BIZ_EXCEPTION);
            }
            return new RpcResult(te);
        }
    } catch (RpcException e) {
        Cat.getProducer().logError(e);
        transaction.setStatus(e);
        if (e.isBiz()) {
            return new RpcResult(e);
        } else {
            throw e;
        }
    } catch (Throwable e) {
        Cat.getProducer().logError(e);
        transaction.setStatus(e);
        return new RpcResult(e);
    } finally {
        transaction.complete();
    }

（2.2）com.alibaba.dubbo.rpc.proxy.AbstractProxyInvoker.invoke()方法调整：

    public Result invoke(Invocation invocation) throws RpcException {
        Transaction transaction = Cat.newTransaction("Service", invocation.getInvoker().getInterface().getSimpleName() + "." + invocation.getMethodName());
        try {
            RpcResult rpcResult = new RpcResult(doInvoke(proxy, invocation.getMethodName(), invocation.getParameterTypes(), invocation.getArguments()));
            transaction.setStatus(Transaction.SUCCESS);
            return rpcResult;
        } catch (InvocationTargetException e) {
            Cat.getProducer().logError(e);
            transaction.setStatus(e);
            return new RpcResult(e.getTargetException());
        } catch (Throwable e) {
            Cat.getProducer().logError(e);
            transaction.setStatus(e);
            throw new RpcException("Failed to invoke remote proxy method " + invocation.getMethodName() + " to " + getUrl() + ", cause: " + e.getMessage(), e);
        } finally {
            transaction.complete();
        }
    }