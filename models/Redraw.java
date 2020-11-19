package io.model;

import com.fasterxml.jackson.annotation.*;

@lombok.Data
public class Redraw {
    private ImportanceList importance;
    private YesNoList risksExplained;
    private RedrawReason reason;
}
