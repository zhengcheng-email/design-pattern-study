## 单例模式
>单例的本质是控制实例的数量。
##### 单例的种类
- 懒汉模式
- 饿汉模式
##### 单例实现的方式
- 私有化构造器，提供静态方法获取实例
- 双重检查实现线程安全的单例模式
- 使用静态内部类持有单例实例，利用静态内部类的加载方式实现线程安全的单例模式
- 使用枚举特性在JVM层面提供绝对的单例