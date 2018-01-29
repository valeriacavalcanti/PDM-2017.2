//
//  ViewController.swift
//  Contador
//
//  Created by ifpb - lab mac on 22/01/2018.
//  Copyright © 2018 ifpb. All rights reserved.
//

import UIKit

class ViewController: UIViewController {

    @IBOutlet weak var stValor: UIStepper!
    @IBOutlet weak var lbValor: UILabel!
    
    
    @IBAction func exibeValor(_ sender: Any) {
        self.lbValor.text = String(self.stValor.value)
        
        if (Int(self.stValor.value) % 2 == 0){
            print("par")
        }else{
            print("impar")
        }
    }
    
}

