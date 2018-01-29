//
//  ViewController.swift
//  Carnaval
//
//  Created by ifpb - lab mac on 29/01/2018.
//  Copyright © 2018 ifpb. All rights reserved.
//

import UIKit

class FormViewController: UIViewController {
    
    var cadastro: Cadastro!
    @IBOutlet weak var tfNome: UITextField!
    @IBOutlet weak var tfValor: UITextField!
    
    
    override func viewDidLoad() {
        super.viewDidLoad()
        
        self.navigationItem.rightBarButtonItem = UIBarButtonItem(barButtonSystemItem: UIBarButtonSystemItem.save, target: self, action: #selector(salvar))
    }

    @objc
    func salvar() {
        let bloco = Bloco(nome: self.tfNome.text!, valor: Float(self.tfValor.text!)!)
        self.cadastro.add(b: bloco)
        self.navigationController?.popViewController(animated: true)
    }
}

