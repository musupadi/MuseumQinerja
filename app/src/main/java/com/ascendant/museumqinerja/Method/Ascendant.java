package com.ascendant.museumqinerja.Method;

import android.app.AlertDialog;
import android.app.DownloadManager;
import android.content.Context;
import android.content.DialogInterface;
import android.net.Uri;
import android.os.Environment;
import android.util.Base64;
import android.widget.Toast;


import java.io.File;
import java.math.BigDecimal;
import java.math.RoundingMode;
import java.text.NumberFormat;
import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.Locale;

public class Ascendant {
    public static void deleteCache(Context context) {
        try {
            File dir = context.getCacheDir();
            deleteDir(dir);
        } catch (Exception e) { e.printStackTrace();}
    }

    public static boolean deleteDir(File dir) {
        if (dir != null && dir.isDirectory()) {
            String[] children = dir.list();
            for (int i = 0; i < children.length; i++) {
                boolean success = deleteDir(new File(dir, children[i]));
                if (!success) {
                    return false;
                }
            }
            return dir.delete();
        } else if(dir!= null && dir.isFile()) {
            return dir.delete();
        } else {
            return false;
        }
    }
//    public void clearApplicationData(Context ctx) {
//        File cache = ctx.getCacheDir();
//        File appDir = new File(cache.getParent());
//        if (appDir.exists()) {
//            String[] children = appDir.list();
//            for (String s : children) {
//                if (!s.equals("lib")) {
//                    deleteDir(new File(appDir, s));
//                    Log.i("Zyargas Error", "**************** File /data/data/APP_PACKAGE/" + s + " DELETED *******************");
//                }
//            }
//        }
//    }
//
//    public static boolean deleteDir(File dir) {
//        if (dir != null && dir.isDirectory()) {
//            String[] children = dir.list();
//            for (int i = 0; i < children.length; i++) {
//                boolean success = deleteDir(new File(dir, children[i]));
//                if (!success) {
//                    return false;
//                }
//            }
//        }
//
//        return dir.delete();
//    }
    public String OneSignalAppId(){
        String OneSignal = "f7221318-7c72-4c22-809c-c1a9b3636ca9";
        return OneSignal;
    }
    public String GetIDYoutube(String link){
        String replace1 = link.replace("https://www.youtube.com/watch?v=","");
        return replace1;
    }

    public String PembulatanHari(String hari){
        Double hari1 = Double.parseDouble(BatasanDouble(Double.parseDouble(hari)));
        Double total = Double.parseDouble(hari)-hari1;
        Integer thot = Integer.parseInt(BatasanDouble(Double.parseDouble(hari)));
        if (total>0){
            thot=thot+1;
        }
        return String.valueOf(thot);
    }
    public String MagicChange(String magic){
        String MAGIC1 = magic.replace("Rp","");
        String MAGIC2 = MAGIC1.replace(",","");
        return MAGIC2.replace(".","");
    }
    public String MagicRP(double nilai){
        Locale localeID = new Locale("in", "ID");
        NumberFormat formatRupiah = NumberFormat.getCurrencyInstance(localeID);
        BigDecimal bd1 = new BigDecimal(nilai).setScale(0, RoundingMode.HALF_UP);
        return formatRupiah.format(bd1);
    }
    public String RPEraser(String magic){
        String MAGIC1 = magic.replace("Rp","");
        String MAGIC2 = MAGIC1.replace("Rp.","");
        String MAGIC3 = MAGIC2.replace(",00","");
        String MAGIC4 = MAGIC3.replace("$ ","");
        return MAGIC4;
    }
//    public void LOGICHOSPITAL5C(Context ctx,String category,int score){
//        String totalscore = "0";
//        if (category.equals("CHARACTER")){
//            if (score >= 0 && score <=5){
//                totalscore = "5";
//            }else if(score >5 && score<=10){
//                totalscore = "10";
//            }else if (score >11 && score<=15){
//                totalscore = "15";
//            }else if (score >=16 && score<=20){
//                totalscore = "20";
//            }
//        }else if(category.equals("CAPACITY")){
//            if (score >= 0 && score <=10){
//                totalscore = "10";
//            }else if(score >=11 && score<=20){
//                totalscore = "20";
//            }else if (score >21 && score<=30){
//                totalscore = "30";
//            }else if (score >=31 && score<=40){
//                totalscore = "40";
//            }
//        }else if(category.equals("CAPITAL")){
//            if (score >= 0 && score <=7){
//                totalscore = "5";
//            }else if(score >=8 && score<=14){
//                totalscore = "10";
//            }else if (score >=15 && score<=20){
//                totalscore = "15";
//            }
//        }else if(category.equals("COLLATERAL")){
//            if (score >= 0 && score <=5){
//                totalscore = "5";
//            }else if(score >=6 && score<=10){
//                totalscore = "10";
//            }
//        }else if(category.equals("CONDITION")){
//            if (score >=0 && score<=6){
//                totalscore = "5";
//            }else if(score >=7 && score<=11){
//                totalscore = "10";
//            }else if (score >=12 && score<=16){
//                totalscore = "15";
//            }
//        }
//        DB_Helper dbHelper = new DB_Helper(ctx);
//        Quis quis = new Quis(category,totalscore);
//        dbHelper.saveScore(quis);
//    }
//    public void LOGICFMCG5C(Context ctx,String KATEGORI,String category,int score){
//        String totalscore = "0";
//        if (KATEGORI.equals("FOOD")){
//            if (category.equals("CHARACTER")){
//                if (score >= 0 && score <=9){
//                    totalscore = "5";
//                }else if(score >9 && score<=18){
//                    totalscore = "10";
//                }else if (score >18 && score<=27){
//                    totalscore = "15";
//                }else if (score >27 && score<=36){
//                    totalscore = "20";
//                }
//            }else if(category.equals("CAPACITY")){
//                if (score >= 0 && score <=12){
//                    totalscore = "10";
//                }else if(score >12 && score<=24){
//                    totalscore = "20";
//                }else if (score >24 && score<=36){
//                    totalscore = "30";
//                }else if (score >36 && score<=48){
//                    totalscore = "40";
//                }
//            }else if(category.equals("CAPITAL")){
//                if (score >= 0 && score <=7){
//                    totalscore = "5";
//                }else if(score >7 && score<=14){
//                    totalscore = "10";
//                }else if (score >14 && score<=20){
//                    totalscore = "15";
//                }
//            }else if(category.equals("COLLATERAL")){
//                if (score >= 1 && score <=10){
//                    totalscore = "5";
//                }else if(score >10 && score<=20){
//                    totalscore = "10";
//                }
//            }else if(category.equals("CONDITION")){
//                if (score >=0 && score<=10){
//                    totalscore = "5";
//                }else if(score >10 && score<=20){
//                    totalscore = "10";
//                }else if (score >20 && score<=30){
//                    totalscore = "15";
//                }
//            }
//        }else if(KATEGORI.equals("NON FOOD ROKOK")){
//            if (category.equals("CHARACTER")){
//                if (score >= 0 && score <=5){
//                    totalscore = "5";
//                }else if(score >5 && score<=10){
//                    totalscore = "10";
//                }else if (score >10 && score<=15){
//                    totalscore = "15";
//                }else if (score >21 && score<=30){
//                    totalscore = "20";
//                }
//            }else if(category.equals("CAPACITY")){
//                if (score >= 0 && score <=7){
//                    totalscore = "5";
//                }else if(score >7 && score<=15){
//                    totalscore = "10";
//                }else if (score >15 && score<=22){
//                    totalscore = "15";
//                }else if (score >22 && score<=30){
//                    totalscore = "20";
//                }
//            }else if(category.equals("CAPITAL")){
//                if (score >= 0 && score <=6){
//                    totalscore = "5";
//                }else if(score >6 && score<=12){
//                    totalscore = "10";
//                }else if (score >12 && score<=18){
//                    totalscore = "15";
//                }else if (score >18 && score<=24){
//                    totalscore = "20";
//                }
//            }else if(category.equals("COLLATERAL")){
//                if (score >= 0 && score <=5){
//                    totalscore = "5";
//                }else if(score >5 && score<=10){
//                    totalscore = "10";
//                }else if(score >=10 && score<=15){
//                    totalscore = "15";
//                }else if(score >=15 && score<=20){
//                    totalscore = "20";
//                }
//            }else if(category.equals("CONDITION")){
//                if (score >=0 && score<=7){
//                    totalscore = "5";
//                }else if(score >7 && score<=15){
//                    totalscore = "10";
//                }else if (score >15 && score<=22){
//                    totalscore = "15";
//                }else if (score >22 && score<=30){
//                    totalscore = "20";
//                }
//            }
//        }else if(KATEGORI.equals("NON FOOD")){
//            if (category.equals("CHARACTER")){
//                if (score >= 0 && score <=9){
//                    totalscore = "5";
//                }else if(score >10 && score<=18){
//                    totalscore = "10";
//                }else if (score >18 && score<=27){
//                    totalscore = "15";
//                }else if (score >27 && score<=36){
//                    totalscore = "20";
//                }
//            }else if(category.equals("CAPACITY")){
//                if (score >= 0 && score <=12){
//                    totalscore = "10";
//                }else if(score >12 && score<=24){
//                    totalscore = "20";
//                }else if (score >24 && score<=36){
//                    totalscore = "30";
//                }else if (score >36 && score<=48){
//                    totalscore = "40";
//                }
//            }else if(category.equals("CAPITAL")){
//                if (score >= 0 && score <=7){
//                    totalscore = "5";
//                }else if(score >7 && score<=14){
//                    totalscore = "10";
//                }else if (score >14 && score<=20){
//                    totalscore = "15";
//                }
//            }else if(category.equals("COLLATERAL")){
//                if (score >= 0 && score <=10){
//                    totalscore = "5";
//                }else if(score >10 && score<=20){
//                    totalscore = "10";
//                }
//            }else if(category.equals("CONDITION")){
//                if (score >=0 && score<=11){
//                    totalscore = "5";
//                }else if(score >11 && score<=21){
//                    totalscore = "10";
//                }else if (score >21 && score<=32){
//                    totalscore = "15";
//                }
//            }
//        }
//        DB_Helper dbHelper = new DB_Helper(ctx);
//        Quis quis = new Quis(category,totalscore);
//        dbHelper.saveScore(quis);
//    }
    public String KategoriFMCG(String kategori){
        String hasil=kategori.toLowerCase();
        if (kategori.equals("F&B")){
            hasil="food";
        }else if(kategori.equals("NON F&B")){
            hasil="non food";
        }
        return hasil;
    }
    public String BatasanDouble2(double nilai){
        BigDecimal bd1 = new BigDecimal(nilai).setScale(2, RoundingMode.HALF_UP);
        return String.valueOf(bd1);
    }
    public String BatasanDouble(double nilai){
        BigDecimal bd1 = new BigDecimal(nilai).setScale(0, RoundingMode.HALF_UP);
        return String.valueOf(bd1);
    }
    public String AUTH(){
        String username = "faba_admin_db";
        String password = "WhiteList_admin_FABA2019";

        String base = username+":"+password;

        String authHeader = "Basic "+ Base64.encodeToString(base.getBytes(),Base64.NO_WRAP);
        return authHeader;
    }
    public String BASE_URL(){
        String URL = "https://mandiri-ebuss.com/";
        return URL;
    }
//    public void Download(final Context ctx, final String file, final String link, final String nama){
//        AlertDialog.Builder builder = new AlertDialog.Builder(ctx);
//        builder.setMessage("Download File ?")
//                .setCancelable(false)
//                .setPositiveButton("Iya", new DialogInterface.OnClickListener() {
//                    public void onClick(DialogInterface dialog, int id) {
//                       try {
//                           if (file.equals("pdf")){
//                               DownloadPDF(link,nama,ctx);
//                           }else if(file.equals("jpg")){
//                               Downloadjpg(link,nama,ctx);
//                           }else{
//                               DownloadPPT(link,nama,ctx);
//                           }
//                       }catch (Exception e){
//                           Toast.makeText(ctx, e.toString(), Toast.LENGTH_SHORT).show();
//                       }
//                    }
//                })
//                .setNegativeButton("Tidak", new DialogInterface.OnClickListener() {
//                    public void onClick(DialogInterface dialog, int id) {
//                        dialog.cancel();
//                    }
//                })
//                //Set your icon here
//                .setTitle("Perhatian !!!")
//                .setIcon(R.drawable.ic_baseline_print_24);
//        AlertDialog alert = builder.create();
//        alert.show();
//    }
    public void Downloadjpg(String url,String judul,Context ctx){
        DownloadManager.Request request = new DownloadManager.Request(Uri.parse(BASE_URL()+url));
        request.setAllowedNetworkTypes(DownloadManager.Request.NETWORK_WIFI | DownloadManager.Request.NETWORK_MOBILE);
        request.setTitle(judul);
        request.setDescription("Downloading "+judul);
        request.allowScanningByMediaScanner();
        request.setNotificationVisibility(DownloadManager.Request.VISIBILITY_VISIBLE_NOTIFY_COMPLETED);
        request.setDestinationInExternalPublicDir(Environment.DIRECTORY_DOWNLOADS,"/eBusiness/"+judul+".jpg");
        DownloadManager manager = (DownloadManager)ctx.getSystemService(Context.DOWNLOAD_SERVICE);
        manager.enqueue(request);
    }
    public void DownloadPPT(String url,String judul,Context ctx){
        DownloadManager.Request request = new DownloadManager.Request(Uri.parse(BASE_URL()+url));
        request.setAllowedNetworkTypes(DownloadManager.Request.NETWORK_WIFI | DownloadManager.Request.NETWORK_MOBILE);
        request.setTitle(judul);
        request.setDescription("Downloading "+judul);
        request.allowScanningByMediaScanner();
        request.setNotificationVisibility(DownloadManager.Request.VISIBILITY_VISIBLE_NOTIFY_COMPLETED);
        request.setDestinationInExternalPublicDir(Environment.DIRECTORY_DOWNLOADS,"/eBusiness/"+judul+".ppsx");
        DownloadManager manager = (DownloadManager)ctx.getSystemService(Context.DOWNLOAD_SERVICE);
        manager.enqueue(request);
    }
    public void DownloadUniversal(String url,String judul,Context ctx,String extension){
        DownloadManager.Request request = new DownloadManager.Request(Uri.parse(BASE_URL()+url));
        request.setAllowedNetworkTypes(DownloadManager.Request.NETWORK_WIFI | DownloadManager.Request.NETWORK_MOBILE);
        request.setTitle(judul);
        request.setDescription("Downloading "+judul);
        request.allowScanningByMediaScanner();
        request.setNotificationVisibility(DownloadManager.Request.VISIBILITY_VISIBLE_NOTIFY_COMPLETED);
        request.setDestinationInExternalPublicDir(Environment.DIRECTORY_DOWNLOADS,"/eBusiness/"+judul+extension);
        DownloadManager manager = (DownloadManager)ctx.getSystemService(Context.DOWNLOAD_SERVICE);
        manager.enqueue(request);
    }
    public void RingkasanDownload(String url,String judul,Context ctx,String extension){
        DownloadManager.Request request = new DownloadManager.Request(Uri.parse(url));
        request.setAllowedNetworkTypes(DownloadManager.Request.NETWORK_WIFI | DownloadManager.Request.NETWORK_MOBILE);
        request.setTitle(judul);
        request.setDescription("Downloading "+judul);
        request.allowScanningByMediaScanner();
        request.setNotificationVisibility(DownloadManager.Request.VISIBILITY_VISIBLE_NOTIFY_COMPLETED);
        request.setDestinationInExternalPublicDir(Environment.DIRECTORY_DOWNLOADS,"/eBusiness/"+judul+extension);
        DownloadManager manager = (DownloadManager)ctx.getSystemService(Context.DOWNLOAD_SERVICE);
        manager.enqueue(request);
    }
    public String SmallDescription(String description){
        String Des = description;
        if (description.length() >= 100){
            Des = description.substring(0,100)+"...";
        }
        return Des;
    }
    public String ExtraSmallText(String description){
        String Des = description;
        if (description.length() >= 15){
            Des = description.substring(0,15)+"...";
        }
        return Des;
    }
    public String SmallText(String description){
        String Des = description;
        if (description.length() >= 50){
            Des = description.substring(0,50)+"...";
        }
        return Des;
    }
    public String dayName(String inputDate, String format){
        Date date = null;
        try {
            date = new SimpleDateFormat(format).parse(inputDate);
        } catch (ParseException e) {
            e.printStackTrace();
        }
        return new SimpleDateFormat("EEEE", Locale.ENGLISH).format(date);
    }
    public String FilterTextToJava(String text){
        String replaces = text.replace("</p>\\r\\n<ol>\\r\\n<li>","");
        String replace1 = replaces.replace("<p>","");
        String replace2 = replace1.replace("</p>","");
        String replace3 = replace2.replace("<span style=\"color: #ff6600;\">","");
        String replace4 = replace3.replace("</span>","");
        String replace5 = replace4.replace("<strong>","");
        String replace6 = replace5.replace("</strong>","");
        String replace7 = replace6.replace("<ol>","");
        String replace8 = replace7.replace("</ol>","");
        String replace9 = replace8.replace("<li>","");
        String replace10 = replace9.replace("</li>","");
        String replace11 = replace10.replace("<ul>","");
        String replace12 = replace11.replace("</ul>","");
        String replace13 = replace12.replace("\\n\\n","\\n");
        String replace14 = replace13.replace("<div>","");
        String replace15 = replace14.replace("</div>","");
        String replace16 = replace15.replace("<p>1.","");
        String replace17 = replace16.replace("<p style=\\\"text-align: left;\\\">","");
        String replace18 = replace17.replace("<em>","");
        String replace19 = replace18.replace("</em>","");
        String replace20 = replace19.replace("&nbsp","");
        return replace20;
    }
    public String Changer(String text){
        String replace = text.replace("<br>","\n");
        return replace;
    }
    public void DownloadPDF(String url, String judul, Context ctx){
        DownloadManager.Request request = new DownloadManager.Request(Uri.parse(BASE_URL()+url));
        request.setAllowedNetworkTypes(DownloadManager.Request.NETWORK_WIFI | DownloadManager.Request.NETWORK_MOBILE);
        request.setTitle(judul);
        request.setDescription("Downloading "+judul);
        request.allowScanningByMediaScanner();
        request.setNotificationVisibility(DownloadManager.Request.VISIBILITY_VISIBLE_NOTIFY_COMPLETED);
        request.setDestinationInExternalPublicDir(Environment.DIRECTORY_DOWNLOADS,"/eBusiness/"+judul+".pdf");
        DownloadManager manager = (DownloadManager)ctx.getSystemService(Context.DOWNLOAD_SERVICE);
        manager.enqueue(request);
    }
    public void DownloadPDFSimulation(String url, String judul, Context ctx){
        DownloadManager.Request request = new DownloadManager.Request(Uri.parse(url));
        request.setAllowedNetworkTypes(DownloadManager.Request.NETWORK_WIFI | DownloadManager.Request.NETWORK_MOBILE);
        request.setTitle(judul);
        request.setDescription("Downloading "+judul);
        request.allowScanningByMediaScanner();
        request.setNotificationVisibility(DownloadManager.Request.VISIBILITY_VISIBLE_NOTIFY_COMPLETED);
        request.setDestinationInExternalPublicDir(Environment.DIRECTORY_DOWNLOADS,"/eBusiness/"+judul+".pdf");
        DownloadManager manager = (DownloadManager)ctx.getSystemService(Context.DOWNLOAD_SERVICE);
        manager.enqueue(request);
    }
    public String MagicDateChange(String dates){
        String result = "";
        String year = dates.substring(0,4);
        String month = dates.substring(5,7);
        String day = dates.substring(8,10);

        String MONTH = "Januari";
        if (month.equals("01") || month.equals("1")){
            MONTH = "Januari";
        }else if (month.equals("02") || month.equals("2")){
            MONTH = "Februari";
        }else if (month.equals("03") || month.equals("3")){
            MONTH = "Maret";
        }else if (month.equals("04") || month.equals("4")){
            MONTH = "April";
        }else if (month.equals("05") || month.equals("5")){
            MONTH = "Mei";
        }else if (month.equals("06") || month.equals("6")){
            MONTH = "Juni";
        }else if (month.equals("07") || month.equals("7")){
            MONTH = "Juli";
        }else if (month.equals("08") || month.equals("8")){
            MONTH = "Agustus";
        }else if (month.equals("09") || month.equals("9")){
            MONTH = "September";
        }else if (month.equals("10")){
            MONTH = "Oktober";
        }else if (month.equals("11")){
            MONTH = "November";
        }else if (month.equals("12")){
            MONTH = "Desember";
        }
        result = day+" "+MONTH+" "+year;
        return result;

    }
}
