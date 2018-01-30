package wie.wiggle.testplanner;

import android.os.Parcel;
import android.os.Parcelable;

/**
 * Created by timox on 24/08/2017.
 */

public class Character implements Parcelable {

    String name;
    int icon;

    Character(String name, int icon) {
        this.name = name;
        this.icon = icon;
    }

    public String getName() {
        return name;
    }

    public int getIcon() {
        return icon;
    }

    protected Character(Parcel in) {
        name = in.readString();
        icon = in.readInt();
    }

    public static final Creator<Character> CREATOR = new Creator<Character>() {
        @Override
        public Character createFromParcel(Parcel in) {
            return new Character(in);
        }

        @Override
        public Character[] newArray(int size) {
            return new Character[size];
        }
    };

    @Override
    public int describeContents() {
        return 0;
    }

    @Override
    public void writeToParcel(Parcel parcel, int i) {
        parcel.writeString(name);
        parcel.writeInt(icon);
    }
}
