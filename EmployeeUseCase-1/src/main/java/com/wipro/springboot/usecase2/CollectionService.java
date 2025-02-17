package com.wipro.springboot.usecase2;

import java.util.HashMap;
import java.util.Map;
import java.util.TreeMap;

import org.springframework.stereotype.Service;



@Service
public class CollectionService {
 
 private final TreeMap<Integer, Employee> treeMap;
 private final HashMap<Integer, Employee> hashMap;
 
 public CollectionService() {
     this.treeMap = new TreeMap<>();
     this.hashMap = new HashMap<>();
     initializeData();
 }
 
 private void initializeData() {
     // Adding sample data to TreeMap
     treeMap.put(1, new Employee(1, "John Doe", "IT", 75000.0d));
     treeMap.put(2, new Employee(2, "Jane Smith", "HR", 65000.0d));
     treeMap.put(3, new Employee(3, "Mike Johnson", "Finance", 85000.0d));
     treeMap.put(4, new Employee(4, "Sarah Williams", "Marketing", 70000.0d));
     treeMap.put(5, new Employee(5, "Robert Brown", "IT", 78000.0d));
 }
 
 public Map<Integer, Employee> getTreeMapData() {
     return treeMap;
 }
 
 public Map<Integer, Employee> transferToHashMap() {
     hashMap.clear();
     hashMap.putAll(treeMap);
     return hashMap;
 }
 
 public Map<Integer, Employee> getHashMapData() {
     return hashMap;
 }
}