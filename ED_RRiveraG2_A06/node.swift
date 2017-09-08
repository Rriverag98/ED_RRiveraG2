
//  node.swift
//  ED_RRiveraG2_A06
//
//  Created by Rodrigo Rivera on 9/7/17. 
//  Copyright © 2017 Rriverag98. All rights reserved.
//
import Foundation

class node {
    var data:Int = 0
    var next:node?
    init(){
        self.data=0
        self.next=nil
    }
    init(data: Int){
        self.data = data
        self.next=nil
    }
    init(data: Int, next: node){
        self.data = data
        self.next = next
    }
    func toString()->String{
        return String(self.data)
    }
}
