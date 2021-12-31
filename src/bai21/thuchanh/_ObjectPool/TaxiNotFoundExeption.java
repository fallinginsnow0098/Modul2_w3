package bai21.thuchanh._ObjectPool;

public class TaxiNotFoundExeption extends RuntimeException{
    public TaxiNotFoundExeption(String message){
        System.out.println(message);
    }
}
