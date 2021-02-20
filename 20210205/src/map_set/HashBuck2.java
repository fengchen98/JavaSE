package map_set;

import java.util.Objects;

class Person {
    public Integer id;

    public Person(Integer id) {
        this.id = id;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Person person = (Person) o;
        return Objects.equals(id, person.id);
    }

    @Override
    public int hashCode() {
        return Objects.hash(id);
    }

    @Override
    public String toString() {
        return "Person{" +
                "id=" + id +
                '}';
    }
}
public class HashBuck2<K,V> {

    static class Node<K,V> {
        public K key;
        public V val;
        public Node<K,V> next;

        public Node(K key, V val) {
            this.key = key;
            this.val = val;
        }
    }

    public Node<K,V>[] array;
    public int usedSize;

    public HashBuck2() {
        this.array = new Node[8];
    }

    public void push(K key,V val) {
        Node<K,V> node = new Node<K,V>(key,val);
        int hash = key.hashCode();
        int index = hash % array.length;
        Node<K,V> cur = array[index];
        while (cur != null) {
            if(cur.key.equals(key)) {
                cur.val = val;
                return;
            }
            cur = cur.next;
        }
        //开始进行头插法  实际上JDK8  是尾插法
        node.next = array[index];
        array[index] = node;
        this.usedSize++;
    }

    public V get(K key) {
        int hash = key.hashCode();
        int index = hash % array.length;
        Node<K,V> cur = array[index];
        while (cur != null) {
            if(cur.key == key) {
                return cur.val;
            }
            cur = cur.next;
        }
        return null;//没找到
    }

    public static void main(String[] args) {
        Person person1 = new Person(1);
        Person person2 = new Person(2);
        HashBuck2<Person,String> hashBuck2 = new HashBuck2<>();
        hashBuck2.push(person1,"fc");
        hashBuck2.push(person2,"xx");
        System.out.println(hashBuck2.get(person1));
       /* Person person1 = new Person(1);
        Person person2 = new Person(2);
        System.out.println(person1.hashCode());
        System.out.println(person2.hashCode());*/
    }

}
