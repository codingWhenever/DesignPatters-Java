package leo.sz.com.designpatters.BehavioralPattern.p13MediatorPattern;

import java.util.Date;

/**
 * 中介者模式(Mediator Pattern)定义：用一个中介对象来封装一系列的对象交互，中介者使各对象不需要显式地相互引用，
 * 从而使其耦合松散，而且可以独立地改变它们之间的交互。中介者模式又称为调停者模式，它是一种对象行为型模式。
 *
 * 中介者模式包含如下角色：
 *
 * Mediator: 抽象中介者
 * ConcreteMediator: 具体中介者
 * Colleague: 抽象同事类
 * ConcreteColleague: 具体同事类
 *
 * @author：leo
 * @date：2019/5/15
 * @email：lei.lu@e-at.com
 */
public class ChatRoom {
    public static void showMessage(User user, String message) {
        System.out.println(new Date().toString()
                + " [" + user.getName() + "] : " + message);
    }
}
