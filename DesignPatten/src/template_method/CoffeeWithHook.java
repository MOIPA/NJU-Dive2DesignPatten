package template_method;

import java.io.BufferedReader;
import java.io.InputStreamReader;

public class CoffeeWithHook extends CaffeineBeverageWithHook {
    @Override
    void brew() {
        System.out.println("Dripping Coffee through filter");
    }

    @Override
    void addCondiments() {
        System.out.println("Add Sugar and Milk");
    }

    // 重写父类决定执行某些流程的函数
    @Override
    boolean customerWantsCondiments() {
        String answer = getUserInput();
        return answer.toLowerCase().startsWith("y");
    }

    private String getUserInput() {
        String answer = null;
        System.out.println("would you like mik and sugar with your coffee?");
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
        try{
            answer=reader.readLine();
        }catch (Exception e){
            System.err.println(e.getMessage());
        }
        if (answer==null)return "no";
        return answer;
    }
}
