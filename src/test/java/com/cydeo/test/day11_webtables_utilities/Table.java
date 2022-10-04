package com.cydeo.test.day11_webtables_utilities;

public class Table {
    // http://practice.cydeo.com/tables
    ////table[@id='table1']
    // //table[@id='table1']//tbody//tr // go streight
    //table[@id='table1']//tbody//tr[2] // only 2 (start with 0, we found 3)
    //table[@id='table1']/tbody - go step by step /
    //table[@id='table1']/tbody//tr//td
    // //table[@id='table1']/tbody//tr//td[2] -> every second in the table
   //     (//table[@id='table1']/tbody//tr[2]//td)[1] -> specific
    //table[@id='table1']/tbody//tr[2]//td[.='Frank'] - find for text
    //table[@id='table1']//tbody//tr[2]//td[.='Frank']//following-sibling::td
    //table[@id='table1']//tbody//tr[2]//td[.='Frank']//following-sibling::td[2] // next after Frank (from sibling to sibling)
}
