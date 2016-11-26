package com.rakaadinugroho.retrofituploadimage;

/**
 * Created by Raka Adi Nugroho on 11/26/16.
 *
 * @Github github.com/rakaadinugroho
 * @Contact nugrohoraka@gmail.com
 */

public class Response {
    private String status;
    private String ket;
    private String directory;

    /**
     *
     * @return
     * The status
     */
    public String getStatus() {
        return status;
    }

    /**
     *
     * @param status
     * The status
     */
    public void setStatus(String status) {
        this.status = status;
    }

    /**
     *
     * @return
     * The ket
     */
    public String getKet() {
        return ket;
    }

    /**
     *
     * @param ket
     * The ket
     */
    public void setKet(String ket) {
        this.ket = ket;
    }

    /**
     *
     * @return
     * The directory
     */
    public String getDirectory() {
        return directory;
    }

    /**
     *
     * @param directory
     * The directory
     */
    public void setDirectory(String directory) {
        this.directory = directory;
    }
}
