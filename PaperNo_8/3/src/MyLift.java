
import java.util.Collections;
import java.util.List;

/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */

/**
 *
 * @author minhk
 */
public class MyLift implements ILift{

    @Override
    public int f1(List<Lift> t) {
        return 0;
    }

    @Override
    public void f2(List<Lift> t) {
        int n = Math.min(5, t.size());
        for (int i = 0; i < n / 2; i++) {
            Collections.swap(t, i, n - 1 - i);
        }
    }

    @Override
    public void f3(List<Lift> t) {
        if (t.size() > 1 && t.get(2).getLoad() < 20) {
            t.remove(2);
        }
    }

}
