1. enable data binding on app level build.grable file
dataBinding {
    enabled true
}

2. transform your layout from something like this:
<TextView
        android:layout_width="match_parent"
        android:layout_height="match_parent"
        android:text="Hello World!"
        tools:context=".MainActivity" />
to:
<?xml version="1.0" encoding="utf-8"?>
<layout xmlns:android="http://schemas.android.com/apk/res/android"
    xmlns:app="http://schemas.android.com/apk/res-auto"
    xmlns:tools="http://schemas.android.com/tools">

    <TextView
        android:layout_width="match_parent"
        android:layout_height="match_parent"
        android:text="Hello World!"
        tools:context=".MainActivity" />

</layout>
Note: Just wrap it inside <layout> tag

3. declare a variable that will hold the binding for main activity. and initialize it

private ActivityMainBinding mBinding;

@Override
protected void onCreate(Bundle savedInstanceState) {
    super.onCreate(savedInstanceState);
    mBinding = DataBindingUtil.setContentView(this, R.layout.activity_main);
}