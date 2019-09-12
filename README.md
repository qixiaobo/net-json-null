# net-json-null
never use net.ef.JsonObjest as wrapper

You may meet this problem as below if you type code like this
```java
  @Test
    public void testAbNormal() throws JsonProcessingException {
        ObjectMapper mapper = new ObjectMapper();
        System.out.println(mapper.writeValueAsString(JSONObject.fromObject(new TestObject(null))));
    }
```

```java
com.fasterxml.jackson.databind.JsonMappingException: null object (through reference chain: net.sf.json.JSONObject["a"])

	at com.fasterxml.jackson.databind.JsonMappingException.wrapWithPath(JsonMappingException.java:394)
	at com.fasterxml.jackson.databind.JsonMappingException.wrapWithPath(JsonMappingException.java:353)
	at com.fasterxml.jackson.databind.ser.std.StdSerializer.wrapAndThrow(StdSerializer.java:316)
	at com.fasterxml.jackson.databind.ser.std.MapSerializer.serializeFields(MapSerializer.java:725)
	at com.fasterxml.jackson.databind.ser.std.MapSerializer.serialize(MapSerializer.java:643)
	at com.fasterxml.jackson.databind.ser.std.MapSerializer.serialize(MapSerializer.java:33)
	at com.fasterxml.jackson.databind.ser.DefaultSerializerProvider._serialize(DefaultSerializerProvider.java:480)
	at com.fasterxml.jackson.databind.ser.DefaultSerializerProvider.serializeValue(DefaultSerializerProvider.java:319)
	at com.fasterxml.jackson.databind.ObjectMapper._configAndWriteValue(ObjectMapper.java:3906)
	at com.fasterxml.jackson.databind.ObjectMapper.writeValueAsString(ObjectMapper.java:3220)
	at me.qixiaobo.example.NetJsonNullExample.testAbNormal(NetJsonNullExample.java:26)
	at sun.reflect.NativeMethodAccessorImpl.invoke0(Native Method)
	at sun.reflect.NativeMethodAccessorImpl.invoke(NativeMethodAccessorImpl.java:57)
	at sun.reflect.DelegatingMethodAccessorImpl.invoke(DelegatingMethodAccessorImpl.java:43)
	at java.lang.reflect.Method.invoke(Method.java:606)
	at org.junit.runners.model.FrameworkMethod$1.runReflectiveCall(FrameworkMethod.java:50)
	at org.junit.internal.runners.model.ReflectiveCallable.run(ReflectiveCallable.java:12)
	at org.junit.runners.model.FrameworkMethod.invokeExplosively(FrameworkMethod.java:47)
	at org.junit.internal.runners.statements.InvokeMethod.evaluate(InvokeMethod.java:17)
	at org.junit.runners.ParentRunner.runLeaf(ParentRunner.java:325)
	at org.junit.runners.BlockJUnit4ClassRunner.runChild(BlockJUnit4ClassRunner.java:78)
	at org.junit.runners.BlockJUnit4ClassRunner.runChild(BlockJUnit4ClassRunner.java:57)
	at org.junit.runners.ParentRunner$3.run(ParentRunner.java:290)
	at org.junit.runners.ParentRunner$1.schedule(ParentRunner.java:71)
	at org.junit.runners.ParentRunner.runChildren(ParentRunner.java:288)
	at org.junit.runners.ParentRunner.access$000(ParentRunner.java:58)
	at org.junit.runners.ParentRunner$2.evaluate(ParentRunner.java:268)
	at org.junit.runners.ParentRunner.run(ParentRunner.java:363)
	at org.junit.runner.JUnitCore.run(JUnitCore.java:137)
	at com.intellij.junit4.JUnit4IdeaTestRunner.startRunnerWithArgs(JUnit4IdeaTestRunner.java:68)
	at com.intellij.rt.execution.junit.IdeaTestRunner$Repeater.startRunnerWithArgs(IdeaTestRunner.java:47)
	at com.intellij.rt.execution.junit.JUnitStarter.prepareStreamsAndStart(JUnitStarter.java:242)
	at com.intellij.rt.execution.junit.JUnitStarter.main(JUnitStarter.java:70)
Caused by: net.sf.json.JSONException: null object
	at net.sf.json.JSONObject.verifyIsNull(JSONObject.java:2827)
	at net.sf.json.JSONObject.isEmpty(JSONObject.java:2206)
	at com.fasterxml.jackson.databind.ser.std.MapSerializer.serialize(MapSerializer.java:631)
	at com.fasterxml.jackson.databind.ser.std.MapSerializer.serialize(MapSerializer.java:33)
	at com.fasterxml.jackson.databind.ser.std.MapSerializer.serializeFields(MapSerializer.java:722)
	... 29 more
```