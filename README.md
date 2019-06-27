# AndroidG

### Utilities

* __Triple__\
_Stores 3 objects_

```java
Triple<Integer, Double, Boolean> triple = new Triple<>(1, 2.5, false);
if (triple.third) ...
```

* __Tuple__\
_Stores up to 8 objegts_

```java
Tuple<Integer, Integer, Boolean, Double, Double, Void, Void, Void> t = Tuple.create(1, 2, false, 1.5, 2.5);
if (t.third) ...
```

* __PermissionsUtil__\
_A simple way to request for runtime permissions with a callback._ __*Works outside activities as well*__

```java
PermissionsUtil.checkPermissions(context, new PermissionsUtil.OnPermissionListener() {
	@Override
	public void onPermissionGranted(String[] permissions) {
		if (permissions.length == 1) ...
	}

	@Override
	public void onPermissionDenied(String[] permissions) {
    if (permissions.length != 0) ...
	}

	@Override
	public void onShouldShowRequestPermissionRationale(String[] permissions) {
		if (permissions.length != 0) ...
	}
}, Manifest.permission.WRITE_EXTERNAL_STORAGE);
```

* __UI utilities__\
_Small UI utilities such as methods for dip to px converter, hiding keyboard, and calculating the Y scroll position in a ListView

```java
dipToPx(16);
pxToDip(100);
hideKeyboard(activity);
getListYScroll(listView);
```

* __Primitive array to list, and list to primitive array convertions__

```java
ArrayList<Boolean> list = new ArrayList<>();
boolean[] array = list.toArray(new boolean[0]);
list = (ArrayList<Boolean>) Arrays.asList(array);
```

### Implementations

* __FragmentBackable and FragmentState__\
_Classes extending Activity and Fragmentd to help save instance state, and catch back press in a freagment_

```java
public class MainActivity extends AppCompatActivity {
    private MyFragment myFragment;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        if (savedInstanceState == null) {
            myFragment = MyFragment.newInstance();
            getSupportFragmentManager().beginTransaction()
                .replace(R.id.fragment, myFragment, "MyFragmentTag")
                .commit();
        }
    }
    
    @NonNull
    @Override
    public int[] getFragmentIds() {
        return new int[]{R.id.fragment};
    }

    @NonNull
    @Override
    public String[] getFragmentTags() {
        return new String[]{"MyFragmentTag"};
    }

    @Override
    public void onBackPressed(boolean handled /* if true, then already handled by a Fragment */) {
        if (!handled) super.onBackPressed();
    }
}

public class MyFragment extends Fragment {
    @Override
    public void onCreate(@Nullable Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        Bundle savedState = getSavedState();
    }

    @Override
    public void onSaveState(@NonNull Bundle outState) {
        outState.put...
    }

    @Override
    public boolean onBackPressed() {
        return false;
    }
}
```
