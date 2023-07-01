# 工厂模式
- 简单工厂模式
- 工厂方法模式
- 抽象工厂模式
![类图](https://res.weread.qq.com/wrepub/epub_679952_20)
 1. 抽象工厂(Creator)
 > 该角色是工厂方法模式的核心，与应用系统无关，任何在创建对象的工厂类必须实现这个接口。
 2. 具体工厂
 > 该角色实现了抽象工厂接口，含有与应用密切相关的逻辑，并且受到应用程序的调用以创建产品对象。
 3. 抽象产品
 > 该角色负责定义产品的共性，实现对产品最抽象的定义。
 4. 具体产品
 > 该角色实现抽象产品角色所声明的接口，工厂方法模式所创建的每一个对象都是某个具体产品角色的实例。