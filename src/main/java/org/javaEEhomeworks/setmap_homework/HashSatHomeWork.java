package org.javaEEhomeworks.setmap_homework;

import java.lang.reflect.Array;
import java.util.*;
import java.util.function.Function;

public class HashSatHomeWork <T extends Number & Comparable> implements Comparator<T>  {

    @Override
    public int compare(T a, T b) {
        return a.compareTo(b);
    }

    class Person{
        String name;
        int age;

        public String getName() {
            return name;
        }

        public void setName(String name) {
            this.name = name;
        }

        public int getAge() {
            return age;
        }

        public void setAge(int age) {
            this.age = age;
        }
    }

    /**
     * Write a program that takes two HashSets of integers and finds the common
     * elements between them
     * @param set
     * @param set2
     */
    public void findCommonElements(HashSet<Integer> set, HashSet<Integer> set2){
        Object[] array ;
        array = set.toArray();
        for (int i = 0; i < set.size(); i++){
            if(set.contains(array[i])){
                System.out.print(" " + array[i]);
            }
        }
    }

    public void sortHashSet(HashSet<Person> set){
        set.stream().sorted();
    }


    /**
     * Write a program that takes a HashSet of strings and returns a new HashSet
     * containing only the unique words in the original set, ignoring case
     * @param words
     */
    public void uniqueWords(HashSet<String> words){
        HashSet<String> finalSet = new HashSet<>();
        ArrayList arrayList = new ArrayList();
        arrayList = (ArrayList) words.stream().toList();
        for (int i = 0; i < words.size(); i++) {
            if (finalSet.size() == 0){
                finalSet.add( arrayList.get(0).toString().toLowerCase());
            }
            if (finalSet.contains(arrayList.get(i).toString().toLowerCase())){
                System.out.println("Already added");
            }else{
                finalSet.add( arrayList.get(i).toString().toLowerCase());
            }
        }
    }

    /**
     * Write a program that takes in a LinkedHashSet of integers and removes any
     * even numbers from the set.
     * @param set
     * @return
     */
    public ArrayList<Integer> removeEvenFromLinkedHS(LinkedHashSet<Integer> set){
        ArrayList<Integer> list = new ArrayList<>();
        list = (ArrayList<Integer>) set.stream().toList();
        for (int i = 0; i < set.size(); i++) {
            if (list.get(i) % 2 == 0){
                list.remove(i);
            }
        }
        return list;
    }

    /**
     * remove duplicate names
     * @param set
     */
    public void removeDuplicateNames(LinkedHashSet<String> set){
        ArrayList<String> list = new ArrayList<>();
        list = (ArrayList<String>) set.stream().toList();
        LinkedHashSet<String> finalSet = new LinkedHashSet<>();
        for (int i = 0; i < list.size(); i++) {
            if (list.isEmpty()){
                finalSet.add( list.get(0));
            }
            if (finalSet.contains(list.get(i))){
                System.out.println("Already added");
            }else{
                finalSet.add( list.get(i));
            }
        }
    }

    public void increasingAgeTreeMap(TreeMap<Integer, Person> treeMap){
        for (int i = 0; i < treeMap.size(); i++) {
            treeMap.get(i);
        }
    }

    /**
     * Write a program that takes in two TreeSets of integers and returns a new set
     * containing only the elements that are in the first set but not in the second set
     * @param set
     * @param set2
     * @return
     */

    public ArrayList<Integer> commonIntoOtherTreeSet(TreeSet<Integer> set, TreeSet<Integer> set2){
        ArrayList<Integer> list = new ArrayList<>();
        ArrayList<Integer> finalList = new ArrayList<>();
        ArrayList<Integer> end = new ArrayList<>();
        list = (ArrayList<Integer>) set.stream().toList();
        finalList = (ArrayList<Integer>) set2.stream().toList();

        if (list.size() >= finalList.size()) {

            for (int i = 0; i < list.size(); i++) {
                if (list.contains(finalList.get(i))) {
                    System.out.println("DO nothing");
                } else {
                    end.add(list.get(i));
                }
            }
        }else{
            for (int i = 0; i < finalList.size(); i++) {
                if (finalList.contains(list.get(i))) {
                    System.out.println("DO nothing");
                } else {
                    end.add(finalList.get(i));
                }
            }
        }
        return end;
    }

    /**
     * Write a program that takes in a TreeSet of strings and returns a new set
     * containing only the unique words in the original set, ignoring case.
     * @param set
     * @return
     */
    public List<String>  uniqueItems(TreeSet<String> set){
        List<String> list = new ArrayList<>();
        list = set.stream().toList();
        Collections.sort(list);
        List<String> finalList = new ArrayList<>();
        String temp;
        for (int i = 0; i < list.size(); i++) {
            temp = list.get(i).toLowerCase();
            if (finalList.contains(temp)){
                System.out.println("In list");
            }else{
                finalList.add(temp);
            }
        }

        return finalList;
    }

    /**
     * Write a program that takes in an array of integers and returns the length of
     * the longest consecutive subsequence of integers in the array using a
     * HashMap
     * @param map
     * @return
     */
    public int longestConsecutiveSubsequenceLength(HashMap<Integer, Integer> map){
        List<Integer> list = new ArrayList<>(map.values());
        List<Integer> nums = new ArrayList<>();
        int sequenceLength = 0;
        for (int i = 0; i < map.size(); i++) {
            if (i != 0 ){
                if (list.get(i) > list.get(i-1)){
                    sequenceLength++;
                }else{
                    nums.add(sequenceLength);
                    sequenceLength = 0;
                }
            }
        }
        return nums.get(nums.size() - 1);
    }

    /**
     * Write a program that takes in an array of strings and returns the number of
     * anagram pairs in the array using a HashMap
     * @param map
     * @return
     */
    public int anagramStringCount(HashMap<Integer, String> map){
        List<String> list = new ArrayList<>(map.values());
        String temp;
        char [] arr;
        int count = 0;
        for (int i = 0; i < list.size(); i++) {
            for (int j = 0; j < list.size(); j++) {
                if (i == 0) {
                    temp = list.get(i);
                    arr = temp.toCharArray();
                    Arrays.sort(arr);
                }
                if (i != 0 && list.get(j).toCharArray().equals(list.get(i).toCharArray())) {
                    count++;
                }
            }
        }
        return count;
    }

    /**
     * Write a program that takes in a list of strings and returns the k most frequent
     * strings in the list using a TreeMap.
     * @param map
     * @param matches
     * @return
     */
    public ArrayList<String> certainNumberOfOccurrences(TreeMap<Integer,String> map, int matches){
        ArrayList <String> list = new ArrayList<>(map.values());
        ArrayList<String> result = new ArrayList<>();
        String temp = list.get(0);
        int count = 0;
        for (int i = 0; i < list.size(); i++) {
            count = Collections.frequency(list, list.get(i));
            if (count == matches ){
                result.add(list.get(i));
            }
        }
        return result;
    }

    public static void main(String[] args) {

    }
}
