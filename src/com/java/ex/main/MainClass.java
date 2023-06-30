package com.java.ex.main;

import com.java.ex.SMcar.China;
import com.java.ex.SMcar.Japen;
import com.java.ex.SMcar.Korea;
import com.java.ex.SMcar.SmCar;

public class MainClass {
    public static void main(String[] args) {
        SmCar sc = new SmCar();
        Korea kr = new Korea();
        Japen jp = new Japen();
        China ch = new China();
        System.out.println("===========본사==========");
        sc.qm3();
        sc.qm6();
        sc.sm3();
        sc.sm5();
        sc.sm7();
        System.out.println("===========한국==========");
        kr.qm3();
        kr.qm6();
        kr.sm3();
        kr.sm5();
        kr.sm7();
        System.out.println("===========일본==========");
        jp.qm3();
        jp.qm6();
        jp.sm3();
        jp.sm5();
        jp.sm7();
        System.out.println("===========중국==========");
        ch.qm3();
        ch.qm6();
        ch.sm3();
        ch.sm5();
        ch.sm7();

    }
}
