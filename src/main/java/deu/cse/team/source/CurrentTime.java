/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package deu.cse.team.source;

import java.text.SimpleDateFormat;
import java.util.Date;

/**
 *
 * @author CHANG
 */
public class CurrentTime {
    public String getCurrentTime() {
        return new SimpleDateFormat ( "yyyy-MM-dd/HH:mm:ss").format(new Date());
    }
}
