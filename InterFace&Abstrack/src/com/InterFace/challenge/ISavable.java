package com.InterFace.challenge;

import java.util.ArrayList;
import java.util.List;

public interface ISavable {
    List<String> write();

    void read(List<String>savedValues);
}
