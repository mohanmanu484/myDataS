package hashing;

/**
 * Created by mohan on 25/05/17.
 */

public class NewHashMap<K, V> {

    public static final int DEAFAULT_CAP = 10;
    private int size = DEAFAULT_CAP;

    Entry[] entryTable = new Entry[DEAFAULT_CAP];

    public static class Entry {

        Entry next;
        private String key;
        private String value;
        private int hash;

        public Entry(String key, String value, int hash) {
            this.key = key;
            this.value = value;
            this.hash = hash;
            next = null;
        }
    }

    public int hash(String key) {
        int hash = key.hashCode();
        return hash % size;
    }



    public static void main(String[] args) {

        NewHashMap newHashMap = new NewHashMap();
        newHashMap.put("one", "mohan");
        newHashMap.put("two", "anand");
        newHashMap.put("three", "ankith");

        System.out.println(newHashMap.get("one"));
        System.out.println(newHashMap.get("two"));
        System.out.println(newHashMap.get("three"));
        newHashMap.put("one", "ankith");

        System.out.println(newHashMap.get("one"));


    }

   /* public void put(String key, String value) {

        int hash = hash(key);
        System.out.println("gen hash " + hash);

        if (key == null) {
            throw new IllegalStateException("cany=t be null");
        }
        Entry entry = new Entry(key, value, hash);
        Entry data = entryTable[hash];
        Entry prev = null;
        if (data != null) {


            while (data != null) {

                if (data.value.equals(value)) {

                    //entry.next=
                    if (prev != null) {
                        prev.next = entry;
                    }
                    entry.next = data.next;
                    break;

                }
                prev = data;
                data = data.next;
            }
            entry.next = prev;
        }
        entryTable[hash] = entry;
    }*/

    public String get(String key) {

        int hash = hash(key);

        Entry data = entryTable[hash];
        if (data != null) {

            //value=data.value;

            while (data != null) {


                if (data.key.equals(key)) {

                    return data.value;
                }

                data = data.next;
            }

        }
        return null;

    }

    public void put(String key, String value) {

        int hash = hash(key);

        Entry newEntry = new Entry(key, value, hash);

        Entry prev = null;
        Entry curr = entryTable[hash];


        if (entryTable[hash] == null) {
            entryTable[hash] = newEntry;
        } else {


            while (curr != null) {


                if (curr.key.equals(key)) {
                    if (prev == null) {

                        newEntry.next = curr.next;
                        entryTable[hash] = newEntry;
                        return;
                    } else {

                        newEntry.next = curr.next;
                        prev.next = newEntry;
                        return;
                    }
                }

                prev=curr;
                curr=curr.next;


            }
            prev.next=newEntry;


        }


    }





}
