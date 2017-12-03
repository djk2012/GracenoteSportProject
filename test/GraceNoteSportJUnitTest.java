/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

import gracenotesports.Data;
import gracenotesports.GracenoteSports;
import java.io.FileNotFoundException;
import org.junit.After;
import org.junit.AfterClass;
import org.junit.Assert;
import org.junit.Before;
import org.junit.BeforeClass;
import org.junit.Test;
import static org.junit.Assert.*;

/**
 *
 * @author ding
 */
public class GraceNoteSportJUnitTest {
    
     //check whether count number of all items in the dataList is equal to 3381
    @Test
    public void validate_size_of_datalist() throws FileNotFoundException {
        GracenoteSports gs = new GracenoteSports();
        int numberOfData=gs.getDataList().size();
        int sizeOfDatalist=3381;
        Assert.assertEquals(numberOfData, sizeOfDatalist);

    }
    
     //check whether actionId of first item in the dataList is equal to 22039489
    @Test
    public void validate_value_of_datalistItem() throws FileNotFoundException {
        GracenoteSports gs = new GracenoteSports();
        Data data=gs.getDataList().get(0);
        String ActionIdOfFirstData="22039489";
        Assert.assertEquals(data.getActionId(), ActionIdOfFirstData);

    }

   
}
