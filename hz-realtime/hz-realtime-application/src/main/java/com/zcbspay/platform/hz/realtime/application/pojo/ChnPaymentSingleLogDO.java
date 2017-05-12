package com.zcbspay.platform.hz.realtime.application.pojo;

// Generated 2017-3-21 17:24:35 by Hibernate Tools 3.4.0.CR1

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;

/**
 * TChnPaymentSingleLog generated by hbm2java
 */
@Entity
@Table(name = "T_CHN_PAYMENT_SINGLE_LOG", schema = "PDTT")
public class ChnPaymentSingleLogDO implements java.io.Serializable {

    private static final long serialVersionUID = -260074883064603049L;
    private long tid;
    private String msgid;
    private String receivetype;
    private String txid;
    private String transdate;
    private String transtime;
    private String debtorname;
    private String debtoraccountno;
    private String debtorbranchcode;
    private String creditorbranchcode;
    private String creditorname;
    private String creditoraccountno;
    private Long amount;
    private String purposeproprietary;
    private String endtoendidentification;
    private String billnumber;
    private String rspmsgid;
    private String rspstatus;
    private String rsprejectcode;
    private String rsprejectinformation;
    private String rspdate;
    private String nettingdate;
    private String commsgid;
    private String comstatus;
    private String comrejectcode;
    private String comrejectinformation;
    private String comdate;
    private String txnseqno;
    private String notes;
    private String remarks;
    private String transmitleg;
    private String receiver;
    private String tradetype;
    private String communno;

    public ChnPaymentSingleLogDO() {
    }

    public ChnPaymentSingleLogDO(long tid) {
        this.tid = tid;
    }

    public ChnPaymentSingleLogDO(long tid, String msgid, String receivetype, String txid, String transdate, String transtime, String debtorname, String debtoraccountno, String debtorbranchcode,
            String creditorbranchcode, String creditorname, String creditoraccountno, Long amount, String purposeproprietary, String endtoendidentification, String billnumber, String rspmsgid,
            String rspstatus, String rsprejectcode, String rsprejectinformation, String rspdate, String nettingdate, String commsgid, String comstatus, String comrejectcode,
            String comrejectinformation, String comdate, String txnseqno, String notes, String remarks, String transmitleg, String receiver, String tradetype, String communno) {
        this.tid = tid;
        this.msgid = msgid;
        this.receivetype = receivetype;
        this.txid = txid;
        this.transdate = transdate;
        this.transtime = transtime;
        this.debtorname = debtorname;
        this.debtoraccountno = debtoraccountno;
        this.debtorbranchcode = debtorbranchcode;
        this.creditorbranchcode = creditorbranchcode;
        this.creditorname = creditorname;
        this.creditoraccountno = creditoraccountno;
        this.amount = amount;
        this.purposeproprietary = purposeproprietary;
        this.endtoendidentification = endtoendidentification;
        this.billnumber = billnumber;
        this.rspmsgid = rspmsgid;
        this.rspstatus = rspstatus;
        this.rsprejectcode = rsprejectcode;
        this.rsprejectinformation = rsprejectinformation;
        this.rspdate = rspdate;
        this.nettingdate = nettingdate;
        this.commsgid = commsgid;
        this.comstatus = comstatus;
        this.comrejectcode = comrejectcode;
        this.comrejectinformation = comrejectinformation;
        this.comdate = comdate;
        this.txnseqno = txnseqno;
        this.notes = notes;
        this.remarks = remarks;
        this.transmitleg = transmitleg;
        this.receiver = receiver;
        this.tradetype = tradetype;
        this.communno = communno;
    }

    @Id
    @Column(name = "TID", unique = true, nullable = false, precision = 12, scale = 0)
    public long getTid() {
        return this.tid;
    }

    public void setTid(long tid) {
        this.tid = tid;
    }

    @Column(name = "MSGID", length = 35)
    public String getMsgid() {
        return this.msgid;
    }

    public void setMsgid(String msgid) {
        this.msgid = msgid;
    }

    @Column(name = "RECEIVETYPE", length = 4)
    public String getReceivetype() {
        return this.receivetype;
    }

    public void setReceivetype(String receivetype) {
        this.receivetype = receivetype;
    }

    @Column(name = "TXID", length = 16)
    public String getTxid() {
        return this.txid;
    }

    public void setTxid(String txid) {
        this.txid = txid;
    }

    @Column(name = "TRANSDATE", length = 8)
    public String getTransdate() {
        return this.transdate;
    }

    public void setTransdate(String transdate) {
        this.transdate = transdate;
    }

    @Column(name = "TRANSTIME", length = 6)
    public String getTranstime() {
        return this.transtime;
    }

    public void setTranstime(String transtime) {
        this.transtime = transtime;
    }

    @Column(name = "DEBTORNAME", length = 120)
    public String getDebtorname() {
        return this.debtorname;
    }

    public void setDebtorname(String debtorname) {
        this.debtorname = debtorname;
    }

    @Column(name = "DEBTORACCOUNTNO", length = 32)
    public String getDebtoraccountno() {
        return this.debtoraccountno;
    }

    public void setDebtoraccountno(String debtoraccountno) {
        this.debtoraccountno = debtoraccountno;
    }

    @Column(name = "DEBTORBRANCHCODE", length = 14)
    public String getDebtorbranchcode() {
        return this.debtorbranchcode;
    }

    public void setDebtorbranchcode(String debtorbranchcode) {
        this.debtorbranchcode = debtorbranchcode;
    }

    @Column(name = "CREDITORBRANCHCODE", length = 14)
    public String getCreditorbranchcode() {
        return this.creditorbranchcode;
    }

    public void setCreditorbranchcode(String creditorbranchcode) {
        this.creditorbranchcode = creditorbranchcode;
    }

    @Column(name = "CREDITORNAME", length = 120)
    public String getCreditorname() {
        return this.creditorname;
    }

    public void setCreditorname(String creditorname) {
        this.creditorname = creditorname;
    }

    @Column(name = "CREDITORACCOUNTNO", length = 32)
    public String getCreditoraccountno() {
        return this.creditoraccountno;
    }

    public void setCreditoraccountno(String creditoraccountno) {
        this.creditoraccountno = creditoraccountno;
    }

    @Column(name = "AMOUNT", precision = 12, scale = 0)
    public Long getAmount() {
        return this.amount;
    }

    public void setAmount(Long amount) {
        this.amount = amount;
    }

    @Column(name = "PURPOSEPROPRIETARY", length = 5)
    public String getPurposeproprietary() {
        return this.purposeproprietary;
    }

    public void setPurposeproprietary(String purposeproprietary) {
        this.purposeproprietary = purposeproprietary;
    }

    @Column(name = "ENDTOENDIDENTIFICATION", length = 60)
    public String getEndtoendidentification() {
        return this.endtoendidentification;
    }

    public void setEndtoendidentification(String endtoendidentification) {
        this.endtoendidentification = endtoendidentification;
    }

    @Column(name = "BILLNUMBER", length = 32)
    public String getBillnumber() {
        return this.billnumber;
    }

    public void setBillnumber(String billnumber) {
        this.billnumber = billnumber;
    }

    @Column(name = "RSPMSGID", length = 35)
    public String getRspmsgid() {
        return this.rspmsgid;
    }

    public void setRspmsgid(String rspmsgid) {
        this.rspmsgid = rspmsgid;
    }

    @Column(name = "RSPSTATUS", length = 4)
    public String getRspstatus() {
        return this.rspstatus;
    }

    public void setRspstatus(String rspstatus) {
        this.rspstatus = rspstatus;
    }

    @Column(name = "RSPREJECTCODE", length = 4)
    public String getRsprejectcode() {
        return this.rsprejectcode;
    }

    public void setRsprejectcode(String rsprejectcode) {
        this.rsprejectcode = rsprejectcode;
    }

    @Column(name = "RSPREJECTINFORMATION", length = 210)
    public String getRsprejectinformation() {
        return this.rsprejectinformation;
    }

    public void setRsprejectinformation(String rsprejectinformation) {
        this.rsprejectinformation = rsprejectinformation;
    }

    @Column(name = "RSPDATE", length = 14)
    public String getRspdate() {
        return this.rspdate;
    }

    public void setRspdate(String rspdate) {
        this.rspdate = rspdate;
    }

    @Column(name = "NETTINGDATE", length = 14)
    public String getNettingdate() {
        return this.nettingdate;
    }

    public void setNettingdate(String nettingdate) {
        this.nettingdate = nettingdate;
    }

    @Column(name = "COMMSGID", length = 35)
    public String getCommsgid() {
        return this.commsgid;
    }

    public void setCommsgid(String commsgid) {
        this.commsgid = commsgid;
    }

    @Column(name = "COMSTATUS", length = 4)
    public String getComstatus() {
        return this.comstatus;
    }

    public void setComstatus(String comstatus) {
        this.comstatus = comstatus;
    }

    @Column(name = "COMREJECTCODE", length = 4)
    public String getComrejectcode() {
        return this.comrejectcode;
    }

    public void setComrejectcode(String comrejectcode) {
        this.comrejectcode = comrejectcode;
    }

    @Column(name = "COMREJECTINFORMATION", length = 210)
    public String getComrejectinformation() {
        return this.comrejectinformation;
    }

    public void setComrejectinformation(String comrejectinformation) {
        this.comrejectinformation = comrejectinformation;
    }

    @Column(name = "COMDATE", length = 14)
    public String getComdate() {
        return this.comdate;
    }

    public void setComdate(String comdate) {
        this.comdate = comdate;
    }

    @Column(name = "TXNSEQNO", length = 16)
    public String getTxnseqno() {
        return this.txnseqno;
    }

    public void setTxnseqno(String txnseqno) {
        this.txnseqno = txnseqno;
    }

    @Column(name = "NOTES", length = 256)
    public String getNotes() {
        return this.notes;
    }

    public void setNotes(String notes) {
        this.notes = notes;
    }

    @Column(name = "REMARKS", length = 256)
    public String getRemarks() {
        return this.remarks;
    }

    public void setRemarks(String remarks) {
        this.remarks = remarks;
    }

    @Column(name = "TRANSMITLEG", length = 10)
    public String getTransmitleg() {
        return this.transmitleg;
    }

    public void setTransmitleg(String transmitleg) {
        this.transmitleg = transmitleg;
    }

    @Column(name = "RECEIVER", length = 10)
    public String getReceiver() {
        return this.receiver;
    }

    public void setReceiver(String receiver) {
        this.receiver = receiver;
    }

    @Column(name = "TRADETYPE", length = 2)
    public String getTradetype() {
        return this.tradetype;
    }

    public void setTradetype(String tradetype) {
        this.tradetype = tradetype;
    }

    @Column(name = "COMMUNNO", length = 16)
    public String getCommunno() {
        return this.communno;
    }

    public void setCommunno(String communno) {
        this.communno = communno;
    }

}
