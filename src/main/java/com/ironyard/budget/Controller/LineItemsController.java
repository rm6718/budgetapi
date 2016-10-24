package com.ironyard.budget.Controller;

import com.ironyard.budget.Data.LineItems;
import com.ironyard.budget.Services.BudgetService;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

import java.sql.SQLException;
import java.util.List;

/**
 * Created by sam on 10/12/16.
 */
@RestController
public class LineItemsController {

    private BudgetService budgetService = new BudgetService();

    @RequestMapping(value = "/lineitems", method = RequestMethod.GET)
    public List<LineItems> list(){
        List<LineItems> items = null;
        try {
            items = budgetService.getLineItems();
        } catch (SQLException e) {
            e.printStackTrace();
        }
        return items;
    }

}
