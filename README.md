# Exam-12766-20161229-1
1.未添加过滤文件，因为上次添加了，反而跑不起来。。
2.数据库配置在dbconfig.properties中 使用sakila数据库

3.测试：
运行lx.test下面的TestFilm文件
启动时，会打印： ContextStartedEvent Context Start！
输入电影名，描述，语言id，每次输入完，回车，继续输入，回车结束
执行插入前，aop会执行调用spring的事件，打印Before Insert Film Data!
执行后，同理打印After Insert Film Data.
context关闭时，打印：ContextClosedEvent: Context stop!
