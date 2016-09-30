
        if(!isNetworkAvailable()){
            Toast.makeText(getApplicationContext(), "No Data Connection Found, " +
                    "Please Turn On Data", Toast.LENGTH_LONG).show();
            Intent intent = new Intent(Settings.ACTION_DATA_ROAMING_SETTINGS);
            startActivity(intent);
        }
