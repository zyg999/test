package lee;

import app.service.impl.Dog;
import org.springframework.expression.spel.standard.SpelExpressionParser;
import org.springframework.expression.spel.support.StandardEvaluationContext;

import java.util.ArrayList;

public class SpELTest {
    public static void main(String[] args) {
        //创建一个ExpressionParser对象，用于解析表达式
        var parser = new SpelExpressionParser();
        var exp = parser.parseExpression("'HelloWord'");
        System.out.println("'HelloWord'的结果：" + exp.getValue());
        exp = parser.parseExpression("'HelloWord'.bytes");
        System.out.println("'HelloWord'.bytes的结果：" + exp.getValue());
        exp = parser.parseExpression("'HelloWord'.bytes.length");
        System.out.println("'HelloWord'.bytes.length的结果：" + exp.getValue());
        var dog = new Dog("小花",5);
        exp = parser.parseExpression("name");
        System.out.println("以Dog为root,name表达式的值是：" + exp.getValue(dog, String.class));
        exp = parser.parseExpression("name=='小花'");
        var ctx = new StandardEvaluationContext();
        ctx.setRootObject(dog);
        System.out.println(exp.getValue(ctx, Boolean.class));
        var list = new ArrayList<Boolean>();
        list.add(true);
        var ctx2 = new StandardEvaluationContext();
        //将list设置成EvaluationContext的一个变量
        ctx2.setVariable("list", list);
        //修改list变量的第一个元素的值
        parser.parseExpression("#list[0]").setValue(ctx2, "false");
        //list集合的第一个元素被改变
        System.out.println("list集合的第一个元素为:" + parser.parseExpression("#list[0]").getValue(ctx2));

    }
}
