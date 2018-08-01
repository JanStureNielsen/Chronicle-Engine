/*
 * Copyright 2016 higherfrequencytrading.com
 *
 *  Licensed under the Apache License, Version 2.0 (the "License");
 *  you may not use this file except in compliance with the License.
 * You may obtain a copy of the License at
 *
 *       http://www.apache.org/licenses/LICENSE-2.0
 *
 * Unless required by applicable law or agreed to in writing, software
 * distributed under the License is distributed on an "AS IS" BASIS,
 * WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied.
 * See the License for the specific language governing permissions and
 * limitations under the License.
 *
 */

package net.openhft.chronicle.engine;

import net.openhft.chronicle.bytes.BytesIn;
import net.openhft.chronicle.bytes.BytesMarshallable;
import net.openhft.chronicle.bytes.BytesOut;
import net.openhft.chronicle.wire.AbstractMarshallable;
import net.openhft.chronicle.wire.WireIn;
import net.openhft.chronicle.wire.WireOut;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

import java.util.Date;

public class Factor extends AbstractMarshallable implements BytesMarshallable {

    private byte openPDFlag;
    private byte openUCFlag;
    private byte openActiveEMFlag;
    private byte openPastDueEMFlag;
    private byte accountCloseFlag;
    private byte missingPaperFlag;
    private byte rMLAgreementCodeFlag;
    private byte nMEAccountFlag;
    private byte accountClassificationTypeValue;
    @Nullable
    private String accountNumber;
    private Date processDate;
    @Nullable
    private String firm;

    @Nullable
    public String getAccountNumber() {
        return accountNumber;
    }

    public void setAccountNumber(String accountNumber) {
        this.accountNumber = accountNumber;
    }

    public byte getAccountClassificationTypeValue() {
        return accountClassificationTypeValue;
    }

    public void setAccountClassificationTypeValue(byte accountClassificationTypeValue) {
        this.accountClassificationTypeValue = accountClassificationTypeValue;
    }

    public byte getOpenPDFlag() {
        return openPDFlag;
    }

    public void setOpenPDFlag(byte openPDFlag) {
        this.openPDFlag = openPDFlag;
    }

    public byte getOpenUCFlag() {
        return openUCFlag;
    }

    public void setOpenUCFlag(byte openUCFlag) {
        this.openUCFlag = openUCFlag;
    }

    public byte getOpenActiveEMFlag() {
        return openActiveEMFlag;
    }

    public void setOpenActiveEMFlag(byte openActiveEMFlag) {
        this.openActiveEMFlag = openActiveEMFlag;
    }

    public byte getOpenPastDueEMFlag() {
        return openPastDueEMFlag;
    }

    public void setOpenPastDueEMFlag(byte openPastDueEMFlag) {
        this.openPastDueEMFlag = openPastDueEMFlag;
    }

    public byte getAccountCloseFlag() {
        return accountCloseFlag;
    }

    public void setAccountCloseFlag(byte accountCloseFlag) {
        this.accountCloseFlag = accountCloseFlag;
    }

    public byte getMissingPaperFlag() {
        return missingPaperFlag;
    }

    public void setMissingPaperFlag(byte missingPaperFlag) {
        this.missingPaperFlag = missingPaperFlag;
    }

    public byte getRMLAgreementCodeFlag() {
        return rMLAgreementCodeFlag;
    }

    public void setRMLAgreementCodeFlag(byte RMLAgreementCodeFlag) {
        this.rMLAgreementCodeFlag = RMLAgreementCodeFlag;
    }

    public byte getNMEAccountFlag() {
        return nMEAccountFlag;
    }

    public void setNMEAccountFlag(byte NMEAccountFlag) {
        this.nMEAccountFlag = NMEAccountFlag;
    }

    public Date getProcessDate() {
        return processDate;
    }

    public void setProcessDate(Date processDate) {
        this.processDate = processDate;
    }

    @Override
    public void readMarshallable(@NotNull BytesIn in) throws IllegalStateException {
        openPDFlag = in.readByte();
        openUCFlag = in.readByte();
        openActiveEMFlag = in.readByte();
        openPastDueEMFlag = in.readByte();
        accountCloseFlag = in.readByte();
        missingPaperFlag = in.readByte();
        rMLAgreementCodeFlag = in.readByte();
        nMEAccountFlag = in.readByte();
        accountClassificationTypeValue = in.readByte();
        accountNumber = in.readUTFΔ();
        firm = in.readUTFΔ();
    }

    @Override
    public void readMarshallable(@NotNull WireIn wireIn) throws IllegalStateException {
        wireIn.read(() -> "openPDFlag").int8(this, (o, b) -> o.openPDFlag = b);
        wireIn.read(() -> "openUCFlag").int8(this, (o, b) -> o.openUCFlag = b);
        wireIn.read(() -> "openActiveEMFlag").int8(this, (o, b) -> o.openActiveEMFlag = b);
        wireIn.read(() -> "openPastDueEMFlag").int8(this, (o, b) -> o.openPastDueEMFlag = b);
        wireIn.read(() -> "accountCloseFlag").int8(this, (o, b) -> o.accountCloseFlag = b);
        wireIn.read(() -> "missingPaperFlag").int8(this, (o, b) -> o.missingPaperFlag = b);
        wireIn.read(() -> "rMLAgreementCodeFlag").int8(this, (o, b) -> o.rMLAgreementCodeFlag = b);
        wireIn.read(() -> "nMEAccountFlag").int8(this, (o, b) -> o.nMEAccountFlag = b);
        wireIn.read(() -> "accountClassificationTypeValue").int8(this, (o, b) -> o.accountClassificationTypeValue = b);
        wireIn.read(() -> "accountNumber")
                .text(this, (o, b) -> o.accountNumber = b);
        wireIn.read(() -> "firm").text(this, (o, b) -> o.firm = b);
    }

    @Override
    public void writeMarshallable(@NotNull BytesOut out) {
        out.writeByte(openPDFlag);
        out.writeByte(openUCFlag);
        out.writeByte(openActiveEMFlag);
        out.writeByte(openPastDueEMFlag);
        out.writeByte(accountCloseFlag);
        out.writeByte(missingPaperFlag);
        out.writeByte(rMLAgreementCodeFlag);
        out.writeByte(nMEAccountFlag);
        out.writeByte(accountClassificationTypeValue);
        out.writeUTFΔ(accountNumber);
        out.writeUTFΔ(firm);
    }

    @Override
    public void writeMarshallable(@NotNull WireOut wireOut) {
        wireOut.write(() -> "openPDFlag").int8(openPDFlag);
        wireOut.write(() -> "openUCFlag").int8(openUCFlag);
        wireOut.write(() -> "openActiveEMFlag").int8(openActiveEMFlag);
        wireOut.write(() -> "openPastDueEMFlag").int8(openPastDueEMFlag);
        wireOut.write(() -> "accountCloseFlag").int8(accountCloseFlag);
        wireOut.write(() -> "missingPaperFlag").int8(missingPaperFlag);
        wireOut.write(() -> "rMLAgreementCodeFlag").int8(rMLAgreementCodeFlag);
        wireOut.write(() -> "nMEAccountFlag").int8(nMEAccountFlag);
        wireOut.write(() -> "accountClassificationTypeValue").int8(accountClassificationTypeValue);
        wireOut.write(() -> "accountNumber")
                .text(accountNumber);
        wireOut.write(() -> "firm").text(firm);
    }
}
