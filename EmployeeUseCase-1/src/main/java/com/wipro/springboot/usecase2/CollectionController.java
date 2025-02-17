package com.wipro.springboot.usecase2;

import java.util.Map;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;



@RestController
@RequestMapping("/api/collections")
public class CollectionController {

 @Autowired
 private CollectionService collectionService;

 @GetMapping("/treemap")
 public ResponseEntity<Map<Integer, Employee>> getTreeMapData() {
     return ResponseEntity.ok(collectionService.getTreeMapData());
 }

 @GetMapping("/transfer")
 public ResponseEntity<Map<Integer, Employee>> transferData() {
     return ResponseEntity.ok(collectionService.transferToHashMap());
 }

 @GetMapping("/hashmap")
 public ResponseEntity<Map<Integer, Employee>> getHashMapData() {
     return ResponseEntity.ok(collectionService.getHashMapData());
 }
}