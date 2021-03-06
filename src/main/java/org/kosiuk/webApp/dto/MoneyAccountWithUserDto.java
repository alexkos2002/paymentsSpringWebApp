package org.kosiuk.webApp.dto;

import org.kosiuk.webApp.util.sumConversion.MoneyStringOperator;
import org.springframework.stereotype.Component;

@Component
public class MoneyAccountWithUserDto implements MoneyStringOperator {

    private Integer id;
    private Long number;
    private String name;
    private String sumString;
    private boolean active;
    private boolean blocked;
    private boolean unlockRequested;
    private boolean canBeLocked;
    private String username;

    public MoneyAccountWithUserDto(Integer id, Long number, String name, String sumString, boolean active, boolean blocked,
                                   boolean unlockRequested, boolean canBeLocked, String username) {
        this.id = id;
        this.number = number;
        this.name = name;
        this.sumString = sumString;
        this.active = active;
        this.blocked = blocked;
        this.unlockRequested = unlockRequested;
        this.canBeLocked = canBeLocked;
        this.username = username;
    }

    public MoneyAccountWithUserDto(MoneyAccountDto moneyAccountDto, String username) {
        this.id = moneyAccountDto.getId();
        this.number = moneyAccountDto.getNumber();
        this.name = moneyAccountDto.getName();
        this.sumString = moneyAccountDto.getSumString();
        this.active = moneyAccountDto.isActive();
        this.blocked = moneyAccountDto.isBlocked();
        this.unlockRequested = moneyAccountDto.isUnlockRequested();
        this.canBeLocked = moneyAccountDto.isBlocked();
        this.username = username;
    }

    public MoneyAccountWithUserDto() {

    }

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public Long getNumber() {
        return number;
    }

    public void setNumber(Long number) {
        this.number = number;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getSumString() {
        return sumString;
    }

    public void setSumString(String sumString) {
        this.sumString = sumString;
    }

    public boolean isActive() {
        return active;
    }

    public void setActive(boolean active) {
        this.active = active;
    }

    public boolean isBlocked() {
        return blocked;
    }

    public void setBlocked(boolean blocked) {
        this.blocked = blocked;
    }

    public boolean isUnlockRequested() {
        return unlockRequested;
    }

    public void setUnlockRequested(boolean unlockRequested) {
        this.unlockRequested = unlockRequested;
    }

    public boolean isCanBeLocked() {
        return canBeLocked;
    }

    public void setCanBeLocked(boolean canBeLocked) {
        this.canBeLocked = canBeLocked;
    }

    public String getUsername() {
        return username;
    }

    public void setUsername(String username) {
        this.username = username;
    }

    @Override
    public String getOperatedSumString() {
        return getSumString();
    }
}
