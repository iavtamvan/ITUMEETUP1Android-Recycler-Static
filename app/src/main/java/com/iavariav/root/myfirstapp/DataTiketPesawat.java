package com.iavariav.root.myfirstapp;

import java.util.ArrayList;

public class DataTiketPesawat {
    public static String[][] dataList = new String[][]{
            {"GARUDA", "http://poskotanews.com/cms/wp-content/uploads/2016/09/garuda-20a.jpg"},
            {"LION", "https://i.ytimg.com/vi/Fc_mcu-WbbE/maxresdefault.jpg"},
            {"CITI LINK", "http://cdn2.tstatic.net/bali/foto/bank/images/citilink-di-udara_20150723_093235.jpg"},
            {"BATIK AIR", "https://i1.wp.com/medantoday.com/wp-content/uploads/2017/10/pesawat-batik-air-medan-today.jpg"}
    };

    public static ArrayList<TiketPesawatModel> getTiketPesawat(){
        TiketPesawatModel pesawatModel = null;
        ArrayList<TiketPesawatModel> list = new ArrayList<>();
        for (int i = 0; i < dataList.length; i++) {
            pesawatModel = new TiketPesawatModel();
            pesawatModel.setNama(dataList[i][0]);
            pesawatModel.setFoto(dataList[i][1]);

            list.add(pesawatModel);
        }
        return list;
    }
}
