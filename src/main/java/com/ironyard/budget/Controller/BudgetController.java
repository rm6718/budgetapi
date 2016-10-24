package com.ironyard.budget.Controller;

import com.ironyard.budget.Data.Budget;
import com.ironyard.budget.Data.LineItems;
import com.ironyard.budget.Services.BudgetService;
import org.springframework.web.bind.annotation.*;

import java.sql.SQLException;
import java.util.List;

/**
 * Created by sam on 10/12/16.
 */
@RestController
public class BudgetController {

    private BudgetService budgetService = new BudgetService();




    @RequestMapping(value = "/lineitems", method = RequestMethod.POST)
    public LineItems save(@RequestBody LineItems myItem){
        LineItems saved = null;
        try {
            budgetService.save(myItem);
            saved = budgetService.getItemById(myItem.getId());
        } catch (SQLException e) {
            e.printStackTrace();
        }
        return saved;
    }

    @RequestMapping(value = "/lineitems/update", method = RequestMethod.PUT)
    public LineItems update(@RequestBody LineItems myItem){
        LineItems updated = null;
        try {
            budgetService.update(myItem);
            updated = budgetService.getItemById(myItem.getId());
        } catch (SQLException e) {
            e.printStackTrace();
        }
        return updated;
    }

    @RequestMapping(value = "/lineitems/{id}", method = RequestMethod.GET)
    public LineItems show(@PathVariable Integer id){
        LineItems found = null;
        try {
            found = budgetService.getItemById(id);
        } catch (SQLException e) {
            e.printStackTrace();
        }
        return found;
    }

    @RequestMapping(value = "/budgetsummary", method = RequestMethod.GET)
    public List<Budget> list(){
        List all = null;
        try {
            all = budgetService.getBudget();
        } catch (SQLException e) {
            e.printStackTrace();
        }
        return all;
    }

    @RequestMapping(value = "/lineitems/delete/{id}", method = RequestMethod.DELETE)
    public LineItems delete(@PathVariable Integer id){
        LineItems deleted = null;
        try {
            deleted = budgetService.getItemById(id);
            budgetService.delete(id);
        } catch (SQLException e) {
            deleted  = null;
            e.printStackTrace();
        }
        return deleted;
    }
}