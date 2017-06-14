package prac.hashing;

/**
 * Created by mohan on 11/05/17.
 */

public class HashTable {

    //ArrayList<String> arrayList=new ArrayList<>(10);
    String[] arrayList=new String[1000];

    public void put(String key,String value){

        int hash=key.length();
        arrayList[hash]=value;

    }






    public String get(String key){
        int pos=key.length();
        return arrayList[pos];

    }

    public static void main(String[] args) {


        HashTable hashTable=new HashTable();

        hashTable.put("one","man");
        hashTable.put("to","women");
        System.out.println(hashTable.get("one"));
        System.out.println(hashTable.get("to"));
        System.out.println(hashTable.get("three"));



    }





}
