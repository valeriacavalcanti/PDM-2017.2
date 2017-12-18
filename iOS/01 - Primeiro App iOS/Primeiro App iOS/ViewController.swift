//
//  ViewController.swift
//  Primeiro App iOS
//
//  Created by ifpb - lab mac on 13/12/2017.
//  Copyright © 2017 ifpb. All rights reserved.
//

import UIKit

class ViewController: UIViewController {
    
    @IBOutlet weak var tfNome: UITextField!
    @IBOutlet weak var lbNome: UILabel!
    
    @IBAction func salvar(_ sender: Any) {
        lbNome.text = tfNome.text
    }
}

