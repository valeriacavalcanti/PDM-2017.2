//
//  FormViewController.swift
//  Janela
//
//  Created by ifpb - lab mac on 24/01/2018.
//  Copyright © 2018 ifpb. All rights reserved.
//

import UIKit

class FormViewController: UIViewController {

    @IBOutlet weak var tfPalavra: UITextField!
    var cadastro: Cadastro!
    
    @IBAction func salvar(_ sender: Any) {
        self.cadastro.add(palavra: self.tfPalavra.text!)
        self.dismiss(animated: true, completion: nil)
    }
    
}
