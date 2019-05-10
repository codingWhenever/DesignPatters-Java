package leo.sz.com.designpatters;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;

import leo.sz.com.designpatters.creationalPattern.p3AbstractFactoryPattern.AbsFactory;
import leo.sz.com.designpatters.creationalPattern.p3AbstractFactoryPattern.AbsProductA;
import leo.sz.com.designpatters.creationalPattern.p3AbstractFactoryPattern.AbsProductB;
import leo.sz.com.designpatters.creationalPattern.p3AbstractFactoryPattern.ConcreteFactory1;
import leo.sz.com.designpatters.creationalPattern.p3AbstractFactoryPattern.ConcreteFactory2;
import leo.sz.com.designpatters.creationalPattern.p4BuilderPattern.ConcreteBuilder;
import leo.sz.com.designpatters.creationalPattern.p4BuilderPattern.Director;
import leo.sz.com.designpatters.creationalPattern.p4BuilderPattern.Product;
import leo.sz.com.designpatters.creationalPattern.p5SingletonPattern.MySingleton;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
    }

    public static void main(String[] args) {
        absFactory();
        builder();
        singleton();
    }

    /**
     * 抽象工厂模式
     */
    public static void absFactory() {
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
        MySingleton.getInstance().getInfo();
        MySingleton.getInstance().getInfo();
        MySingleton.getInstance().getInfo();
    }
}
