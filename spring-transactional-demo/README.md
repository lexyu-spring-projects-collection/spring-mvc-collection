```
Item Save Successfully...
Item Save Successfully...
Item Save Successfully...
Item Save Successfully...
Item Save Successfully...
Item Save Successfully...
Item Save Successfully...
Exception in thread "main" java.lang.RuntimeException: Some Error Occur...
	at org.lex.practice.service.ItemService.saveItemInfo(ItemService.java:27)
	at org.lex.practice.App.main(App.java:16)
```
- @EnableTransactionManagement
- TransactionManager
```
Item Save Successfully...
Item Save Successfully...
Item Save Successfully...
Item Save Successfully...
Item Save Successfully...
Item Save Successfully...
Item Save Successfully...
Exception in thread "main" java.lang.RuntimeException: Some Error Occur...
	at org.lex.practice.service.ItemService.saveItemInfo(ItemService.java:27)
	at java.base/jdk.internal.reflect.DirectMethodHandleAccessor.invoke(DirectMethodHandleAccessor.java:103)
	at java.base/java.lang.reflect.Method.invoke(Method.java:580)
	at org.springframework.aop.support.AopUtils.invokeJoinpointUsingReflection(AopUtils.java:351)
	at org.springframework.aop.framework.ReflectiveMethodInvocation.invokeJoinpoint(ReflectiveMethodInvocation.java:196)
	at org.springframework.aop.framework.ReflectiveMethodInvocation.proceed(ReflectiveMethodInvocation.java:163)
	at org.springframework.aop.framework.CglibAopProxy$CglibMethodInvocation.proceed(CglibAopProxy.java:765)
	at org.springframework.transaction.interceptor.TransactionInterceptor$1.proceedWithInvocation(TransactionInterceptor.java:123)
	at org.springframework.transaction.interceptor.TransactionAspectSupport.invokeWithinTransaction(TransactionAspectSupport.java:385)
	at org.springframework.transaction.interceptor.TransactionInterceptor.invoke(TransactionInterceptor.java:119)
	at org.springframework.aop.framework.ReflectiveMethodInvocation.proceed(ReflectiveMethodInvocation.java:184)
	at org.springframework.aop.framework.CglibAopProxy$CglibMethodInvocation.proceed(CglibAopProxy.java:765)
	at org.springframework.aop.framework.CglibAopProxy$DynamicAdvisedInterceptor.intercept(CglibAopProxy.java:717)
	at org.lex.practice.service.ItemService$$SpringCGLIB$$0.saveItemInfo(<generated>)
	at org.lex.practice.App.main(App.java:16)
```

# AOP
```kotlin
Aspect {
    Start The Trans
    Call Your Method
    Commit Trans
    Close
}
```