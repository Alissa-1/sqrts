package ru.netology.sqr.quantityOfSqrts.services;
public class SQRService {
    public int sqrts(int a, int b){
        int n = 0;
        for (int i = 10; i <= 99; i++) {
            if ((i * i >= a) && (i * i <= b)) {
                n = n + 1;
            }
        }
        return n;
    }
}
