//
//  ListarTableViewController.swift
//  Apuração
//
//  Created by ifpb - lab mac on 31/01/2018.
//  Copyright © 2018 ifpb. All rights reserved.
//

import UIKit

class ListarTableViewController: UITableViewController {
    
    var cadastro: Cadastro!

    override func viewDidLoad() {
        super.viewDidLoad()

        // Uncomment the following line to preserve selection between presentations
        // self.clearsSelectionOnViewWillAppear = false

        // Uncomment the following line to display an Edit button in the navigation bar for this view controller.
        self.navigationItem.leftBarButtonItem = self.editButtonItem
        
        self.cadastro = (UIApplication.shared.delegate as! AppDelegate).cadastro
    }

   // MARK: - Table view data source

    override func numberOfSections(in tableView: UITableView) -> Int {
        return 1
    }

    override func tableView(_ tableView: UITableView, numberOfRowsInSection section: Int) -> Int {
        return self.cadastro.quantidade()
    }

    override func tableView(_ tableView: UITableView, cellForRowAt indexPath: IndexPath) -> UITableViewCell {
        let cell = tableView.dequeueReusableCell(withIdentifier: "escola", for: indexPath)

        let escola = self.cadastro.lista[indexPath.row]
        
        cell.textLabel?.text = escola.nome

        return cell
    }



    // Override to support conditional editing of the table view.
    override func tableView(_ tableView: UITableView, canEditRowAt indexPath: IndexPath) -> Bool {
        // Return false if you do not want the specified item to be editable.
        let escola = self.cadastro.lista[indexPath.row]
        if (escola.nota == 10){
            return false
        }else{
            return true
        }
    }



    // Override to support editing the table view.
    override func tableView(_ tableView: UITableView, commit editingStyle: UITableViewCellEditingStyle, forRowAt indexPath: IndexPath) {
        if editingStyle == .delete {
            // Delete the row from the data source
            self.cadastro.del(index: indexPath.row)
            tableView.deleteRows(at: [indexPath], with: .fade)
        }
    }



    // Override to support rearranging the table view.
    override func tableView(_ tableView: UITableView, moveRowAt fromIndexPath: IndexPath, to: IndexPath) {

    }



    // Override to support conditional rearranging of the table view.
    override func tableView(_ tableView: UITableView, canMoveRowAt indexPath: IndexPath) -> Bool {
        // Return false if you do not want the item to be re-orderable.
        return true
    }


    // MARK: - Navigation

    // In a storyboard-based application, you will often want to do a little preparation before navigation
    override func prepare(for segue: UIStoryboardSegue, sender: Any?){
        if (segue.identifier == "listar_form"){
            let fvc = segue.destination as! FormViewController
            fvc.cadastro = self.cadastro
        }
    }

    override func viewWillAppear(_ animated: Bool) {
        super.viewWillAppear(true)
        self.tableView.reloadData()
    }
    
    
}
