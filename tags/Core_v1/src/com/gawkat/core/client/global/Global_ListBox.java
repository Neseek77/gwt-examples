package com.gawkat.core.client.global;

import com.google.gwt.user.client.ui.ListBox;

public class Global_ListBox {

  /**
   * get selected value(int)
   * 
   * @param lb
   * @return
   */
  public static int getSelectedValue(ListBox lb) {
    int sel = lb.getSelectedIndex();
    String value = lb.getValue(sel);
    int r = 0;
    try {
      r = Integer.parseInt(value);
    } catch (NumberFormatException e) {
      r = 0;
    }
    return r;
  }
  
  /**
   * set listbox value(int) selected
   * 
   * @param lb
   * @param value
   */
  public static void setSelected(ListBox lb, int value) {
    int sel = 0;
    for (int i=0; i < lb.getItemCount(); i++) {
      int v = 0;
      try {
        v = Integer.parseInt(lb.getValue(i)); 
      } catch (NumberFormatException e) {
        v = 0;
      }
      if (value == v) {
        sel = i;
        break;
      }
    }
    lb.setSelectedIndex(sel);
  }
  
}
