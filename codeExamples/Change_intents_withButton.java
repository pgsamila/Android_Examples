
        Botton.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                new Handler().postDelayed(new Runnable() {
                    @Override
                    public void run() {
                        final Intent mainIntent1 = new Intent(Activity1.this, Activity2.class);
                        homeActivity.this.startActivity(mainIntent1);
                        //loginActivity.this.finish();
                    }
                }, 0);

            }
        });
