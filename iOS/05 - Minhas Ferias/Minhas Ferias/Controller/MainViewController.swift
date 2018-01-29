//
//  ViewController.swift
//  Minhas Ferias
//
//  Created by ifpb - lab mac on 22/01/2018.
//  Copyright © 2018 ifpb. All rights reserved.
//

import UIKit

class MainViewController: UIViewController {
    @IBOutlet weak var tfTexto: UITextField!
    @IBOutlet weak var lbTexto: UILabel!
    
    @IBAction func exibirTexto(_ sender: Any) {
        print("Cliquei no botão")
        let texto = self.tfTexto.text
        self.lbTexto.text = texto
    }
}

