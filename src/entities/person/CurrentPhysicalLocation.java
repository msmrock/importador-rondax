package entities.person;

import com.google.gson.annotations.Expose;
import com.google.gson.annotations.SerializedName;

public class CurrentPhysicalLocation {

    @SerializedName("id")
    @Expose
    private Integer id;
    @SerializedName("parent")
    @Expose
    private Integer parent;
    @SerializedName("name")
    @Expose
    private String name;
    @SerializedName("status")
    @Expose
    private String status;
    @SerializedName("timeSlotList")
    @Expose
    private TimeSlotList timeSlotList;
    @SerializedName("localTimezone")
    @Expose
    private LocalTimezone localTimezone;
    @SerializedName("roleSuspensionValidation")
    @Expose
    private Boolean roleSuspensionValidation;
    @SerializedName("levelValidation")
    @Expose
    private Boolean levelValidation;
    @SerializedName("antiPassbackValidation")
    @Expose
    private Boolean antiPassbackValidation;
    @SerializedName("capacityValidation")
    @Expose
    private Boolean capacityValidation;
    @SerializedName("accessCreditValidation")
    @Expose
    private Boolean accessCreditValidation;
    @SerializedName("roleValidation")
    @Expose
    private Boolean roleValidation;
    @SerializedName("slotTimeRoleValidation")
    @Expose
    private Boolean slotTimeRoleValidation;
    @SerializedName("slotTimePhysicalValidation")
    @Expose
    private Boolean slotTimePhysicalValidation;
    @SerializedName("roleAuthorizerValidation")
    @Expose
    private Boolean roleAuthorizerValidation;
    @SerializedName("physicalLocationAuthorizerValidation")
    @Expose
    private Boolean physicalLocationAuthorizerValidation;
    @SerializedName("checkInBetweenWorkdays")
    @Expose
    private Boolean checkInBetweenWorkdays;
    @SerializedName("antiPassbackTimeout")
    @Expose
    private Integer antiPassbackTimeout;
    @SerializedName("customValidation")
    @Expose
    private Boolean customValidation;
    @SerializedName("externalPhysicalLocation")
    @Expose
    private Boolean externalPhysicalLocation;
    @SerializedName("_discriminator")
    @Expose
    private String discriminator;

    /**
     * No args constructor for use in serialization
     * 
     */
    public CurrentPhysicalLocation() {
    }

    /**
     * 
     * @param parent
     * @param antiPassbackValidation
     * @param checkInBetweenWorkdays
     * @param slotTimeRoleValidation
     * @param antiPassbackTimeout
     * @param timeSlotList
     * @param localTimezone
     * @param externalPhysicalLocation
     * @param discriminator
     * @param roleSuspensionValidation
     * @param slotTimePhysicalValidation
     * @param physicalLocationAuthorizerValidation
     * @param roleAuthorizerValidation
     * @param accessCreditValidation
     * @param roleValidation
     * @param name
     * @param customValidation
     * @param id
     * @param levelValidation
     * @param capacityValidation
     * @param status
     */
    public CurrentPhysicalLocation(Integer id, Integer parent, String name, String status, TimeSlotList timeSlotList, LocalTimezone localTimezone, Boolean roleSuspensionValidation, Boolean levelValidation, Boolean antiPassbackValidation, Boolean capacityValidation, Boolean accessCreditValidation, Boolean roleValidation, Boolean slotTimeRoleValidation, Boolean slotTimePhysicalValidation, Boolean roleAuthorizerValidation, Boolean physicalLocationAuthorizerValidation, Boolean checkInBetweenWorkdays, Integer antiPassbackTimeout, Boolean customValidation, Boolean externalPhysicalLocation, String discriminator) {
        super();
        this.id = id;
        this.parent = parent;
        this.name = name;
        this.status = status;
        this.timeSlotList = timeSlotList;
        this.localTimezone = localTimezone;
        this.roleSuspensionValidation = roleSuspensionValidation;
        this.levelValidation = levelValidation;
        this.antiPassbackValidation = antiPassbackValidation;
        this.capacityValidation = capacityValidation;
        this.accessCreditValidation = accessCreditValidation;
        this.roleValidation = roleValidation;
        this.slotTimeRoleValidation = slotTimeRoleValidation;
        this.slotTimePhysicalValidation = slotTimePhysicalValidation;
        this.roleAuthorizerValidation = roleAuthorizerValidation;
        this.physicalLocationAuthorizerValidation = physicalLocationAuthorizerValidation;
        this.checkInBetweenWorkdays = checkInBetweenWorkdays;
        this.antiPassbackTimeout = antiPassbackTimeout;
        this.customValidation = customValidation;
        this.externalPhysicalLocation = externalPhysicalLocation;
        this.discriminator = discriminator;
    }

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public CurrentPhysicalLocation withId(Integer id) {
        this.id = id;
        return this;
    }

    public Integer getParent() {
        return parent;
    }

    public void setParent(Integer parent) {
        this.parent = parent;
    }

    public CurrentPhysicalLocation withParent(Integer parent) {
        this.parent = parent;
        return this;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public CurrentPhysicalLocation withName(String name) {
        this.name = name;
        return this;
    }

    public String getStatus() {
        return status;
    }

    public void setStatus(String status) {
        this.status = status;
    }

    public CurrentPhysicalLocation withStatus(String status) {
        this.status = status;
        return this;
    }

    public TimeSlotList getTimeSlotList() {
        return timeSlotList;
    }

    public void setTimeSlotList(TimeSlotList timeSlotList) {
        this.timeSlotList = timeSlotList;
    }

    public CurrentPhysicalLocation withTimeSlotList(TimeSlotList timeSlotList) {
        this.timeSlotList = timeSlotList;
        return this;
    }

    public LocalTimezone getLocalTimezone() {
        return localTimezone;
    }

    public void setLocalTimezone(LocalTimezone localTimezone) {
        this.localTimezone = localTimezone;
    }

    public CurrentPhysicalLocation withLocalTimezone(LocalTimezone localTimezone) {
        this.localTimezone = localTimezone;
        return this;
    }

    public Boolean getRoleSuspensionValidation() {
        return roleSuspensionValidation;
    }

    public void setRoleSuspensionValidation(Boolean roleSuspensionValidation) {
        this.roleSuspensionValidation = roleSuspensionValidation;
    }

    public CurrentPhysicalLocation withRoleSuspensionValidation(Boolean roleSuspensionValidation) {
        this.roleSuspensionValidation = roleSuspensionValidation;
        return this;
    }

    public Boolean getLevelValidation() {
        return levelValidation;
    }

    public void setLevelValidation(Boolean levelValidation) {
        this.levelValidation = levelValidation;
    }

    public CurrentPhysicalLocation withLevelValidation(Boolean levelValidation) {
        this.levelValidation = levelValidation;
        return this;
    }

    public Boolean getAntiPassbackValidation() {
        return antiPassbackValidation;
    }

    public void setAntiPassbackValidation(Boolean antiPassbackValidation) {
        this.antiPassbackValidation = antiPassbackValidation;
    }

    public CurrentPhysicalLocation withAntiPassbackValidation(Boolean antiPassbackValidation) {
        this.antiPassbackValidation = antiPassbackValidation;
        return this;
    }

    public Boolean getCapacityValidation() {
        return capacityValidation;
    }

    public void setCapacityValidation(Boolean capacityValidation) {
        this.capacityValidation = capacityValidation;
    }

    public CurrentPhysicalLocation withCapacityValidation(Boolean capacityValidation) {
        this.capacityValidation = capacityValidation;
        return this;
    }

    public Boolean getAccessCreditValidation() {
        return accessCreditValidation;
    }

    public void setAccessCreditValidation(Boolean accessCreditValidation) {
        this.accessCreditValidation = accessCreditValidation;
    }

    public CurrentPhysicalLocation withAccessCreditValidation(Boolean accessCreditValidation) {
        this.accessCreditValidation = accessCreditValidation;
        return this;
    }

    public Boolean getRoleValidation() {
        return roleValidation;
    }

    public void setRoleValidation(Boolean roleValidation) {
        this.roleValidation = roleValidation;
    }

    public CurrentPhysicalLocation withRoleValidation(Boolean roleValidation) {
        this.roleValidation = roleValidation;
        return this;
    }

    public Boolean getSlotTimeRoleValidation() {
        return slotTimeRoleValidation;
    }

    public void setSlotTimeRoleValidation(Boolean slotTimeRoleValidation) {
        this.slotTimeRoleValidation = slotTimeRoleValidation;
    }

    public CurrentPhysicalLocation withSlotTimeRoleValidation(Boolean slotTimeRoleValidation) {
        this.slotTimeRoleValidation = slotTimeRoleValidation;
        return this;
    }

    public Boolean getSlotTimePhysicalValidation() {
        return slotTimePhysicalValidation;
    }

    public void setSlotTimePhysicalValidation(Boolean slotTimePhysicalValidation) {
        this.slotTimePhysicalValidation = slotTimePhysicalValidation;
    }

    public CurrentPhysicalLocation withSlotTimePhysicalValidation(Boolean slotTimePhysicalValidation) {
        this.slotTimePhysicalValidation = slotTimePhysicalValidation;
        return this;
    }

    public Boolean getRoleAuthorizerValidation() {
        return roleAuthorizerValidation;
    }

    public void setRoleAuthorizerValidation(Boolean roleAuthorizerValidation) {
        this.roleAuthorizerValidation = roleAuthorizerValidation;
    }

    public CurrentPhysicalLocation withRoleAuthorizerValidation(Boolean roleAuthorizerValidation) {
        this.roleAuthorizerValidation = roleAuthorizerValidation;
        return this;
    }

    public Boolean getPhysicalLocationAuthorizerValidation() {
        return physicalLocationAuthorizerValidation;
    }

    public void setPhysicalLocationAuthorizerValidation(Boolean physicalLocationAuthorizerValidation) {
        this.physicalLocationAuthorizerValidation = physicalLocationAuthorizerValidation;
    }

    public CurrentPhysicalLocation withPhysicalLocationAuthorizerValidation(Boolean physicalLocationAuthorizerValidation) {
        this.physicalLocationAuthorizerValidation = physicalLocationAuthorizerValidation;
        return this;
    }

    public Boolean getCheckInBetweenWorkdays() {
        return checkInBetweenWorkdays;
    }

    public void setCheckInBetweenWorkdays(Boolean checkInBetweenWorkdays) {
        this.checkInBetweenWorkdays = checkInBetweenWorkdays;
    }

    public CurrentPhysicalLocation withCheckInBetweenWorkdays(Boolean checkInBetweenWorkdays) {
        this.checkInBetweenWorkdays = checkInBetweenWorkdays;
        return this;
    }

    public Integer getAntiPassbackTimeout() {
        return antiPassbackTimeout;
    }

    public void setAntiPassbackTimeout(Integer antiPassbackTimeout) {
        this.antiPassbackTimeout = antiPassbackTimeout;
    }

    public CurrentPhysicalLocation withAntiPassbackTimeout(Integer antiPassbackTimeout) {
        this.antiPassbackTimeout = antiPassbackTimeout;
        return this;
    }

    public Boolean getCustomValidation() {
        return customValidation;
    }

    public void setCustomValidation(Boolean customValidation) {
        this.customValidation = customValidation;
    }

    public CurrentPhysicalLocation withCustomValidation(Boolean customValidation) {
        this.customValidation = customValidation;
        return this;
    }

    public Boolean getExternalPhysicalLocation() {
        return externalPhysicalLocation;
    }

    public void setExternalPhysicalLocation(Boolean externalPhysicalLocation) {
        this.externalPhysicalLocation = externalPhysicalLocation;
    }

    public CurrentPhysicalLocation withExternalPhysicalLocation(Boolean externalPhysicalLocation) {
        this.externalPhysicalLocation = externalPhysicalLocation;
        return this;
    }

    public String getDiscriminator() {
        return discriminator;
    }

    public void setDiscriminator(String discriminator) {
        this.discriminator = discriminator;
    }

    public CurrentPhysicalLocation withDiscriminator(String discriminator) {
        this.discriminator = discriminator;
        return this;
    }

}
