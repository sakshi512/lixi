package io.model;

import com.fasterxml.jackson.annotation.*;
import java.util.List;

@lombok.Data
public class NeedsAnalysisInterview {
    private YesNoList allApplicantsPresent;
    private YesNoList allApplicantsUnderstandEnglish;
    private String date;
    private YesNoList interpreterRecommended;
    private String xLocation;
    private List<Attendee> attendee;
}
