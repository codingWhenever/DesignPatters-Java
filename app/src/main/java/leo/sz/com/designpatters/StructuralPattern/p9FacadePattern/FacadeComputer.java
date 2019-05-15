package leo.sz.com.designpatters.StructuralPattern.p9FacadePattern;

/**
 * 外观模式(Facade Pattern)：外部与一个子系统的通信必须通过一个统一的外观对象进行，
 * 为子系统中的一组接口提供一个一致的界面，外观模式定义了一个高层接口，
 * 这个接口使得这一子系统更加容易使用。外观模式又称为门面模式，它是一种对象结构型模式。
 *
 * 外观模式包含如下角色：
 *
 * Facade: 外观角色
 * SubSystem:子系统角色
 * @author：leo
 * @date：2019/5/13
 * @email：lei.lu@e-at.com
 */
public class FacadeComputer {
    private CPU cpu;
    private Screen screen;
    private Memory memory;

    public FacadeComputer() {
        cpu = new CPU();
        screen = new Screen();
        memory = new Memory();
    }

    public void start() {
        cpu.init();
        screen.init();
        memory.init();
    }
}
