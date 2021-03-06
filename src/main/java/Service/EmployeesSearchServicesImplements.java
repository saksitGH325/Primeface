/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Service;

import Model.Employees;
import com.blogspot.na5cent.connectdb.query.QueryBuilder3;
import com.blogspot.na5cent.connectdb.util.SqlUtils;
import java.util.List;

/**
 *
 * @author wanchana
 */
public class EmployeesSearchServicesImplements implements EmployeesSearchServices{
    @Override
    public List<Employees> search(String keyword) {
        keyword = SqlUtils.wrapKeywordLike(keyword);
        
        return QueryBuilder3.fromSQL("SELECT * FROM Employees")
                .executeforList(Employees.class);
    }

}
