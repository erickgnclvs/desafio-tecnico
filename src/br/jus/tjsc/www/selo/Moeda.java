/*
 * XML Type:  moeda
 * Namespace: http://www.tjsc.jus.br/selo
 * Java type: br.jus.tjsc.www.selo.Moeda
 *
 * Automatically generated - do not modify.
 */
package br.jus.tjsc.www.selo;


/**
 * An XML moeda(@http://www.tjsc.jus.br/selo).
 *
 * This is a complex type.
 */
public interface Moeda extends org.apache.xmlbeans.XmlObject
{
    public static final org.apache.xmlbeans.SchemaType type = (org.apache.xmlbeans.SchemaType)
        org.apache.xmlbeans.XmlBeans.typeSystemForClassLoader(Moeda.class.getClassLoader(), "schemaorg_apache_xmlbeans.system.sC0155BB0B18E3286864972FF633C0AFE").resolveHandle("moeda2166type");
    
    /**
     * Gets the "cdmoeda" element
     */
    short getCdmoeda();
    
    /**
     * Gets (as xml) the "cdmoeda" element
     */
    org.apache.xmlbeans.XmlShort xgetCdmoeda();
    
    /**
     * True if has "cdmoeda" element
     */
    boolean isSetCdmoeda();
    
    /**
     * Sets the "cdmoeda" element
     */
    void setCdmoeda(short cdmoeda);
    
    /**
     * Sets (as xml) the "cdmoeda" element
     */
    void xsetCdmoeda(org.apache.xmlbeans.XmlShort cdmoeda);
    
    /**
     * Unsets the "cdmoeda" element
     */
    void unsetCdmoeda();
    
    /**
     * Gets the "desimbolo" element
     */
    java.lang.String getDesimbolo();
    
    /**
     * Gets (as xml) the "desimbolo" element
     */
    org.apache.xmlbeans.XmlString xgetDesimbolo();
    
    /**
     * True if has "desimbolo" element
     */
    boolean isSetDesimbolo();
    
    /**
     * Sets the "desimbolo" element
     */
    void setDesimbolo(java.lang.String desimbolo);
    
    /**
     * Sets (as xml) the "desimbolo" element
     */
    void xsetDesimbolo(org.apache.xmlbeans.XmlString desimbolo);
    
    /**
     * Unsets the "desimbolo" element
     */
    void unsetDesimbolo();
    
    /**
     * Gets the "dtvigencia" element
     */
    java.util.Calendar getDtvigencia();
    
    /**
     * Gets (as xml) the "dtvigencia" element
     */
    org.apache.xmlbeans.XmlDateTime xgetDtvigencia();
    
    /**
     * True if has "dtvigencia" element
     */
    boolean isSetDtvigencia();
    
    /**
     * Sets the "dtvigencia" element
     */
    void setDtvigencia(java.util.Calendar dtvigencia);
    
    /**
     * Sets (as xml) the "dtvigencia" element
     */
    void xsetDtvigencia(org.apache.xmlbeans.XmlDateTime dtvigencia);
    
    /**
     * Unsets the "dtvigencia" element
     */
    void unsetDtvigencia();
    
    /**
     * Gets the "flmoedabr" element
     */
    short getFlmoedabr();
    
    /**
     * Gets (as xml) the "flmoedabr" element
     */
    org.apache.xmlbeans.XmlShort xgetFlmoedabr();
    
    /**
     * Sets the "flmoedabr" element
     */
    void setFlmoedabr(short flmoedabr);
    
    /**
     * Sets (as xml) the "flmoedabr" element
     */
    void xsetFlmoedabr(org.apache.xmlbeans.XmlShort flmoedabr);
    
    /**
     * Gets the "flvigente" element
     */
    short getFlvigente();
    
    /**
     * Gets (as xml) the "flvigente" element
     */
    org.apache.xmlbeans.XmlShort xgetFlvigente();
    
    /**
     * Sets the "flvigente" element
     */
    void setFlvigente(short flvigente);
    
    /**
     * Sets (as xml) the "flvigente" element
     */
    void xsetFlvigente(org.apache.xmlbeans.XmlShort flvigente);
    
    /**
     * Gets the "nmmoeda" element
     */
    java.lang.String getNmmoeda();
    
    /**
     * Gets (as xml) the "nmmoeda" element
     */
    org.apache.xmlbeans.XmlString xgetNmmoeda();
    
    /**
     * True if has "nmmoeda" element
     */
    boolean isSetNmmoeda();
    
    /**
     * Sets the "nmmoeda" element
     */
    void setNmmoeda(java.lang.String nmmoeda);
    
    /**
     * Sets (as xml) the "nmmoeda" element
     */
    void xsetNmmoeda(org.apache.xmlbeans.XmlString nmmoeda);
    
    /**
     * Unsets the "nmmoeda" element
     */
    void unsetNmmoeda();
    
    /**
     * Gets the "nmmoedaplural" element
     */
    java.lang.String getNmmoedaplural();
    
    /**
     * Gets (as xml) the "nmmoedaplural" element
     */
    org.apache.xmlbeans.XmlString xgetNmmoedaplural();
    
    /**
     * True if has "nmmoedaplural" element
     */
    boolean isSetNmmoedaplural();
    
    /**
     * Sets the "nmmoedaplural" element
     */
    void setNmmoedaplural(java.lang.String nmmoedaplural);
    
    /**
     * Sets (as xml) the "nmmoedaplural" element
     */
    void xsetNmmoedaplural(org.apache.xmlbeans.XmlString nmmoedaplural);
    
    /**
     * Unsets the "nmmoedaplural" element
     */
    void unsetNmmoedaplural();
    
    /**
     * A factory class with static methods for creating instances
     * of this type.
     */
    
    public static final class Factory
    {
        public static br.jus.tjsc.www.selo.Moeda newInstance() {
          return (br.jus.tjsc.www.selo.Moeda) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().newInstance( type, null ); }
        
        public static br.jus.tjsc.www.selo.Moeda newInstance(org.apache.xmlbeans.XmlOptions options) {
          return (br.jus.tjsc.www.selo.Moeda) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().newInstance( type, options ); }
        
        /** @param xmlAsString the string value to parse */
        public static br.jus.tjsc.www.selo.Moeda parse(java.lang.String xmlAsString) throws org.apache.xmlbeans.XmlException {
          return (br.jus.tjsc.www.selo.Moeda) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( xmlAsString, type, null ); }
        
        public static br.jus.tjsc.www.selo.Moeda parse(java.lang.String xmlAsString, org.apache.xmlbeans.XmlOptions options) throws org.apache.xmlbeans.XmlException {
          return (br.jus.tjsc.www.selo.Moeda) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( xmlAsString, type, options ); }
        
        /** @param file the file from which to load an xml document */
        public static br.jus.tjsc.www.selo.Moeda parse(java.io.File file) throws org.apache.xmlbeans.XmlException, java.io.IOException {
          return (br.jus.tjsc.www.selo.Moeda) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( file, type, null ); }
        
        public static br.jus.tjsc.www.selo.Moeda parse(java.io.File file, org.apache.xmlbeans.XmlOptions options) throws org.apache.xmlbeans.XmlException, java.io.IOException {
          return (br.jus.tjsc.www.selo.Moeda) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( file, type, options ); }
        
        public static br.jus.tjsc.www.selo.Moeda parse(java.net.URL u) throws org.apache.xmlbeans.XmlException, java.io.IOException {
          return (br.jus.tjsc.www.selo.Moeda) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( u, type, null ); }
        
        public static br.jus.tjsc.www.selo.Moeda parse(java.net.URL u, org.apache.xmlbeans.XmlOptions options) throws org.apache.xmlbeans.XmlException, java.io.IOException {
          return (br.jus.tjsc.www.selo.Moeda) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( u, type, options ); }
        
        public static br.jus.tjsc.www.selo.Moeda parse(java.io.InputStream is) throws org.apache.xmlbeans.XmlException, java.io.IOException {
          return (br.jus.tjsc.www.selo.Moeda) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( is, type, null ); }
        
        public static br.jus.tjsc.www.selo.Moeda parse(java.io.InputStream is, org.apache.xmlbeans.XmlOptions options) throws org.apache.xmlbeans.XmlException, java.io.IOException {
          return (br.jus.tjsc.www.selo.Moeda) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( is, type, options ); }
        
        public static br.jus.tjsc.www.selo.Moeda parse(java.io.Reader r) throws org.apache.xmlbeans.XmlException, java.io.IOException {
          return (br.jus.tjsc.www.selo.Moeda) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( r, type, null ); }
        
        public static br.jus.tjsc.www.selo.Moeda parse(java.io.Reader r, org.apache.xmlbeans.XmlOptions options) throws org.apache.xmlbeans.XmlException, java.io.IOException {
          return (br.jus.tjsc.www.selo.Moeda) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( r, type, options ); }
        
        public static br.jus.tjsc.www.selo.Moeda parse(javax.xml.stream.XMLStreamReader sr) throws org.apache.xmlbeans.XmlException {
          return (br.jus.tjsc.www.selo.Moeda) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( sr, type, null ); }
        
        public static br.jus.tjsc.www.selo.Moeda parse(javax.xml.stream.XMLStreamReader sr, org.apache.xmlbeans.XmlOptions options) throws org.apache.xmlbeans.XmlException {
          return (br.jus.tjsc.www.selo.Moeda) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( sr, type, options ); }
        
        public static br.jus.tjsc.www.selo.Moeda parse(org.w3c.dom.Node node) throws org.apache.xmlbeans.XmlException {
          return (br.jus.tjsc.www.selo.Moeda) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( node, type, null ); }
        
        public static br.jus.tjsc.www.selo.Moeda parse(org.w3c.dom.Node node, org.apache.xmlbeans.XmlOptions options) throws org.apache.xmlbeans.XmlException {
          return (br.jus.tjsc.www.selo.Moeda) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( node, type, options ); }
        
        /** @deprecated {@link org.apache.xmlbeans.xml.stream.XMLInputStream} */
        public static br.jus.tjsc.www.selo.Moeda parse(org.apache.xmlbeans.xml.stream.XMLInputStream xis) throws org.apache.xmlbeans.XmlException, org.apache.xmlbeans.xml.stream.XMLStreamException {
          return (br.jus.tjsc.www.selo.Moeda) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( xis, type, null ); }
        
        /** @deprecated {@link org.apache.xmlbeans.xml.stream.XMLInputStream} */
        public static br.jus.tjsc.www.selo.Moeda parse(org.apache.xmlbeans.xml.stream.XMLInputStream xis, org.apache.xmlbeans.XmlOptions options) throws org.apache.xmlbeans.XmlException, org.apache.xmlbeans.xml.stream.XMLStreamException {
          return (br.jus.tjsc.www.selo.Moeda) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( xis, type, options ); }
        
        /** @deprecated {@link org.apache.xmlbeans.xml.stream.XMLInputStream} */
        public static org.apache.xmlbeans.xml.stream.XMLInputStream newValidatingXMLInputStream(org.apache.xmlbeans.xml.stream.XMLInputStream xis) throws org.apache.xmlbeans.XmlException, org.apache.xmlbeans.xml.stream.XMLStreamException {
          return org.apache.xmlbeans.XmlBeans.getContextTypeLoader().newValidatingXMLInputStream( xis, type, null ); }
        
        /** @deprecated {@link org.apache.xmlbeans.xml.stream.XMLInputStream} */
        public static org.apache.xmlbeans.xml.stream.XMLInputStream newValidatingXMLInputStream(org.apache.xmlbeans.xml.stream.XMLInputStream xis, org.apache.xmlbeans.XmlOptions options) throws org.apache.xmlbeans.XmlException, org.apache.xmlbeans.xml.stream.XMLStreamException {
          return org.apache.xmlbeans.XmlBeans.getContextTypeLoader().newValidatingXMLInputStream( xis, type, options ); }
        
        private Factory() { } // No instance of this class allowed
    }
}
