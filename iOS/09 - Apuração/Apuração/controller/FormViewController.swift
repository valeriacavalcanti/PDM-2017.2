//
//  ViewController.swift
//  Apuração
//
//  Created by ifpb - lab mac on 31/01/2018.
//  Copyright © 2018 ifpb. All rights reserved.
//

import UIKit

class FormViewController: UIViewController {

    @IBOutlet weak var tfNome: UITextField!
    @IBOutlet weak var slNota: UISlider!
    @IBOutlet weak var lbNota: UILabel!
    
    var cadastro: Cadastro!
    
    @IBAction func definirNota(_ sender: Any) {
        self.lbNota.text = String(Int(self.slNota.value))
    }
    
    override func viewDidLoad() {
        super.viewDidLoad()
        self.navigationItem.rightBarButtonItem = UIBarButtonItem(barButtonSystemItem: UIBarButtonSystemItem.save, target: self, action: #selector(salvar))
    }
    
    @objc
    func salvar() {
        let escola = Escola(nome: self.tfNome.text!, nota: Int(self.slNota.value))
        self.cadastro.add(escola: escola)
        self.navigationController?.popViewController(animated: true)
    }
}

