package leo.sz.com.designpatters;

import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;

import java.lang.reflect.InvocationHandler;

import leo.sz.com.designpatters.BehavioralPattern.p12BehavioralPattern.BuyStock;
import leo.sz.com.designpatters.BehavioralPattern.p12BehavioralPattern.Invoker;
import leo.sz.com.designpatters.BehavioralPattern.p12BehavioralPattern.SellStock;
import leo.sz.com.designpatters.BehavioralPattern.p12BehavioralPattern.Stock;
import leo.sz.com.designpatters.BehavioralPattern.p13MediatorPattern.User;
import leo.sz.com.designpatters.BehavioralPattern.p14ObserverPattern.BinaryObserver;
import leo.sz.com.designpatters.BehavioralPattern.p14ObserverPattern.ConcreteSubject;
import leo.sz.com.designpatters.BehavioralPattern.p14ObserverPattern.HexaObserver;
import leo.sz.com.designpatters.BehavioralPattern.p14ObserverPattern.OctalObserver;
import leo.sz.com.designpatters.BehavioralPattern.p15StatePattern.ConcreteStateB;
import leo.sz.com.designpatters.BehavioralPattern.p15StatePattern.Context;
import leo.sz.com.designpatters.BehavioralPattern.p15StatePattern.GContext;
import leo.sz.com.designpatters.BehavioralPattern.p15StatePattern.IState;
import leo.sz.com.designpatters.BehavioralPattern.p15StatePattern.StartState;
import leo.sz.com.designpatters.BehavioralPattern.p15StatePattern.StopState;
import leo.sz.com.designpatters.BehavioralPattern.p15StatePattern.voter.VoteManager;
import leo.sz.com.designpatters.BehavioralPattern.p16StrategyPattern.OperationAdd;
import leo.sz.com.designpatters.BehavioralPattern.p16StrategyPattern.OperationMultiply;
import leo.sz.com.designpatters.BehavioralPattern.p16StrategyPattern.OperationSubstract;
import leo.sz.com.designpatters.BehavioralPattern.p17ChainOfResponsibilityPattern.AbsLogger;
import leo.sz.com.designpatters.BehavioralPattern.p17ChainOfResponsibilityPattern.ConsoleLogger;
import leo.sz.com.designpatters.BehavioralPattern.p17ChainOfResponsibilityPattern.ErrorLogger;
import leo.sz.com.designpatters.BehavioralPattern.p17ChainOfResponsibilityPattern.FileLogger;
import leo.sz.com.designpatters.CreationalPattern.p3AbstractFactoryPattern.AbsFactory;
import leo.sz.com.designpatters.CreationalPattern.p3AbstractFactoryPattern.AbsProductA;
import leo.sz.com.designpatters.CreationalPattern.p3AbstractFactoryPattern.AbsProductB;
import leo.sz.com.designpatters.CreationalPattern.p3AbstractFactoryPattern.ConcreteFactory1;
import leo.sz.com.designpatters.CreationalPattern.p3AbstractFactoryPattern.ConcreteFactory2;
import leo.sz.com.designpatters.CreationalPattern.p4BuilderPattern.ConcreteBuilder;
import leo.sz.com.designpatters.CreationalPattern.p4BuilderPattern.Director;
import leo.sz.com.designpatters.CreationalPattern.p4BuilderPattern.Product;
import leo.sz.com.designpatters.CreationalPattern.p5SingletonPattern.MySingleton;
import leo.sz.com.designpatters.StructuralPattern.p10FlyweightPattern.Circle;
import leo.sz.com.designpatters.StructuralPattern.p10FlyweightPattern.ShapeFactory;
import leo.sz.com.designpatters.StructuralPattern.p11ProxyPattern.dynamicProxy.DynamicSubject;
import leo.sz.com.designpatters.StructuralPattern.p11ProxyPattern.dynamicProxy.RealSubject;
import leo.sz.com.designpatters.StructuralPattern.p11ProxyPattern.dynamicProxy.Subject;
import leo.sz.com.designpatters.StructuralPattern.p11ProxyPattern.staticProxy.Proxy;
import leo.sz.com.designpatters.StructuralPattern.p6AdapterPattern.Adaptee;
import leo.sz.com.designpatters.StructuralPattern.p6AdapterPattern.Adapter;
import leo.sz.com.designpatters.StructuralPattern.p6AdapterPattern.Target;
import leo.sz.com.designpatters.StructuralPattern.p7BridgePattern.Abstraction;
import leo.sz.com.designpatters.StructuralPattern.p7BridgePattern.ConcreteImplementorA;
import leo.sz.com.designpatters.StructuralPattern.p7BridgePattern.ConcreteImplementorB;
import leo.sz.com.designpatters.StructuralPattern.p7BridgePattern.RefinedAbstraction;
import leo.sz.com.designpatters.StructuralPattern.p8DecoratorPattern.Component;
import leo.sz.com.designpatters.StructuralPattern.p8DecoratorPattern.ConcreteComponent;
import leo.sz.com.designpatters.StructuralPattern.p8DecoratorPattern.ConcreteDecoratorA;
import leo.sz.com.designpatters.StructuralPattern.p8DecoratorPattern.ConcreteDecoratorB;
import leo.sz.com.designpatters.StructuralPattern.p8DecoratorPattern.Decorator;
import leo.sz.com.designpatters.StructuralPattern.p9FacadePattern.FacadeComputer;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
    }

    public static void main(String[] args) {
//        absFactory();
//        builder();
//        singleton();
//
//        adapter();
//
//        bridge();
//
//        decorator();
//
//        facade();
//
//        flyWeight();
//
//        proxy();
//
//        dynamicProxy();
//
//        command();
//
//        Mediator();
//
//        observer();
//
//        state();
//
//        statePattern();
//
//        voteStatePattern();
//
//        strategy();

        AbsLogger loggerChain = getChainOfLoggers();
        loggerChain.logMessage(AbsLogger.INFO, "this is an information.");
        loggerChain.logMessage(AbsLogger.DEBUG, "this is a debug level information");
        loggerChain.logMessage(AbsLogger.ERROR, "this is a error level information");
    }


    /**
     * 抽象工厂模式
     */
    public static void absFactory() {
        System.out.println("------AbsFactory Pattern------");
        AbsFactory fc = new ConcreteFactory1();
        AbsProductA productA = fc.createProductA();
        AbsProductB productB = fc.createProductB();
        productA.use();
        productB.eat();

        AbsFactory fc2 = new ConcreteFactory2();
        AbsProductA pa2 = fc2.createProductA();
        AbsProductB pb2 = fc2.createProductB();
        pa2.use();
        pb2.eat();
    }

    /**
     * 建造者模式
     */
    public static void builder() {
        Product product = new Product();
        ConcreteBuilder builder = new ConcreteBuilder(product);
        Director director = new Director();
        director.setBuilder(builder);
        director.construct();

        product.show();
    }

    /**
     * 单例模式
     */
    public static void singleton() {
        System.out.println("------Singleton Pattern------");
        MySingleton.getInstance().getInfo();
        MySingleton.getInstance().getInfo();
        MySingleton.getInstance().getInfo();
    }

    /**
     * 适配器模式
     */
    public static void adapter() {
        System.out.println("------Adapter Pattern------");
        Adaptee adaptee = new Adaptee();
        Target target = new Adapter(adaptee);
        target.request1();
        target.request2();

    }

    /**
     * 桥接模式
     */
    public static void bridge() {
        System.out.println("------Bridge Pattern------");
        Abstraction abs = new RefinedAbstraction(new ConcreteImplementorA());
        abs.operation();

        Abstraction abs2 = new RefinedAbstraction(new ConcreteImplementorB());
        abs2.operation();

    }

    /**
     * 装饰者模式
     */
    public static void decorator() {
        System.out.println("------Decorator Pattern------");
        Component component = new ConcreteComponent();
        Decorator decoratorA = new ConcreteDecoratorA(component);
        decoratorA.sampleOperation();
        Decorator decoratorB = new ConcreteDecoratorB(component);
        decoratorB.sampleOperation();
    }

    /**
     * 外观模式
     */
    public static void facade() {
        System.out.println("------Facade Pattern------");
        FacadeComputer facadeComputer = new FacadeComputer();
        facadeComputer.start();
    }

    static String colors[] = {"Red", "Green", "Blue", "White", "Black"};

    /**
     * 享元模式
     */
    public static void flyWeight() {
        System.out.println("------FlyWeight Pattern------");
        for (int i = 0; i < 10; i++) {
            Circle circle = (Circle) ShapeFactory.getCircle(getRandomColor());
            circle.setX(getRandomX());
            circle.setY(getRandomY());
            circle.setRadius(100);
            circle.draw();
        }
    }

    private static String getRandomColor() {
        return colors[(int) (Math.random() * (colors.length))];
    }

    private static int getRandomX() {
        return (int) (Math.random() * 100);
    }

    private static int getRandomY() {
        return (int) (Math.random() * 100);
    }

    /**
     * 代理模式
     */
    private static void proxy() {
        System.out.println("------Proxy Pattern------");
        Proxy proxy = new Proxy();
        proxy.request();
    }

    /**
     * 动态代理
     */
    private static void dynamicProxy() {
        System.out.println("------Dynamic proxy Pattern------");
        RealSubject rs = new RealSubject();
        InvocationHandler handler = new DynamicSubject(rs);
        Class cls = rs.getClass();
        Subject subject1 = (Subject) java.lang.reflect.Proxy.newProxyInstance(cls.getClassLoader(), cls.getInterfaces(), handler);
        subject1.request();

//        try {
//            Class c = java.lang.reflect.Proxy.getProxyClass(cls.getClassLoader(), cls.getInterfaces());
//            Constructor ct = c.getConstructor(new Class[]{InvocationHandler.class});
//            Subject sub = (Subject) ct.newInstance(new Object[]{handler});
//            sub.request();
//        } catch (Exception ex) {
//
//        }

    }

    /**
     * 命令模式
     */
    public static void command() {
        System.out.println("------Command Pattern------");
        Stock stock = new Stock();
        BuyStock buyStock = new BuyStock(stock);
        SellStock sellStock = new SellStock(stock);
        Invoker invoker = new Invoker();
        invoker.takeOrder(buyStock);
        invoker.takeOrder(sellStock);
        invoker.placeOrders();
    }

    /**
     * 中介者模式
     */
    public static void Mediator() {
        System.out.println("------Mediator Pattern------");
        User user1 = new User("zhangsan");
        User user2 = new User("lisi");
        user1.sendMessage("hi, my name is zhangsan.");
        user2.sendMessage("hello, my name is lisi.");
    }

    /**
     * 观察者模式
     */
    public static void observer() {
        System.out.println("------Observer Pattern------");
        leo.sz.com.designpatters.BehavioralPattern.p14ObserverPattern.Subject subject = new ConcreteSubject();
        new BinaryObserver(subject);
        new OctalObserver(subject);
        new HexaObserver(subject);
        System.out.println("First state change: 15");
        ((ConcreteSubject) subject).setState(15);
        System.out.println("Second state change: 10");
        ((ConcreteSubject) subject).setState(10);
    }

    /**
     * 状态模式
     */
    public static void state() {
        System.out.println("------State Pattern 1------");
        Context context = new Context();
        new StartState().doAction(context);

        System.out.println(context.getState().toString());

        new StopState().doAction(context);
        System.out.println(context.getState().toString());
    }

    /**
     * 状态模式2
     */
    public static void statePattern() {
        System.out.println("------State Pattern 2------");
        IState state = new ConcreteStateB();
        GContext context = new GContext();
        context.setState(state);
        context.request("test");
    }

    /**
     * 状态模式3 模拟投票器
     */
    public static void voteStatePattern() {
        System.out.println("------State Pattern 3------");
        VoteManager manager = new VoteManager();
        for (int i = 0; i < 9; i++) {
            manager.vote("leo", "A");
        }
    }

    /**
     * 策略模式
     */
    public static void strategy() {
        System.out.println("------Strategy Pattern------");
        leo.sz.com.designpatters.BehavioralPattern.p16StrategyPattern.Context context = new leo.sz.com.designpatters.BehavioralPattern.p16StrategyPattern.Context(new OperationAdd());
        System.out.println("10 + 5 = " + context.executeStrategy(10, 5));

        context = new leo.sz.com.designpatters.BehavioralPattern.p16StrategyPattern.Context(new OperationSubstract());
        System.out.println("10 - 5 = " + context.executeStrategy(10, 5));

        context = new leo.sz.com.designpatters.BehavioralPattern.p16StrategyPattern.Context(new OperationMultiply());
        System.out.println("10 * 5 =" + context.executeStrategy(10, 5));
    }

    /**
     * 责任链模式
     * @return
     */
    public static AbsLogger getChainOfLoggers() {
        AbsLogger consoleLogger = new ConsoleLogger(AbsLogger.INFO);
        AbsLogger errorLogger = new ErrorLogger(AbsLogger.ERROR);
        AbsLogger fileLogger = new FileLogger(AbsLogger.DEBUG);
        consoleLogger.setNextLogger(fileLogger);
        fileLogger.setNextLogger(errorLogger);
        return errorLogger;
    }
}
