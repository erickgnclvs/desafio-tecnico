/*
 * XML Type:  tipoCobranca
 * Namespace: http://www.tjsc.jus.br/selo
 * Java type: br.jus.tjsc.www.selo.TipoCobranca
 *
 * Automatically generated - do not modify.
 */
package br.jus.tjsc.www.selo;


/**
 * An XML tipoCobranca(@http://www.tjsc.jus.br/selo).
 *
 * This is a complex type.
 */
public interface TipoCobranca extends org.apache.xmlbeans.XmlObject
{
    public static final org.apache.xmlbeans.SchemaType type = (org.apache.xmlbeans.SchemaType)
        org.apache.xmlbeans.XmlBeans.typeSystemForClassLoader(TipoCobranca.class.getClassLoader(), "schemaorg_apache_xmlbeans.system.sC0155BB0B18E3286864972FF633C0AFE").resolveHandle("tipocobranca7733type");
    
    /**
     * Gets the "cdtipocobranca" element
     */
    long getCdtipocobranca();
    
    /**
     * Gets (as xml) the "cdtipocobranca" element
     */
    org.apache.xmlbeans.XmlLong xgetCdtipocobranca();
    
    /**
     * True if has "cdtipocobranca" element
     */
    boolean isSetCdtipocobranca();
    
    /**
     * Sets the "cdtipocobranca" element
     */
    void setCdtipocobranca(long cdtipocobranca);
    
    /**
     * Sets (as xml) the "cdtipocobranca" element
     */
    void xsetCdtipocobranca(org.apache.xmlbeans.XmlLong cdtipocobranca);
    
    /**
     * Unsets the "cdtipocobranca" element
     */
    void unsetCdtipocobranca();
    
    /**
     * Gets the "dispositivolegal" element
     */
    java.lang.String getDispositivolegal();
    
    /**
     * Gets (as xml) the "dispositivolegal" element
     */
    org.apache.xmlbeans.XmlString xgetDispositivolegal();
    
    /**
     * True if has "dispositivolegal" element
     */
    boolean isSetDispositivolegal();
    
    /**
     * Sets the "dispositivolegal" element
     */
    void setDispositivolegal(java.lang.String dispositivolegal);
    
    /**
     * Sets (as xml) the "dispositivolegal" element
     */
    void xsetDispositivolegal(org.apache.xmlbeans.XmlString dispositivolegal);
    
    /**
     * Unsets the "dispositivolegal" element
     */
    void unsetDispositivolegal();
    
    /**
     * Gets the "nmtipocobranca" element
     */
    java.lang.String getNmtipocobranca();
    
    /**
     * Gets (as xml) the "nmtipocobranca" element
     */
    org.apache.xmlbeans.XmlString xgetNmtipocobranca();
    
    /**
     * True if has "nmtipocobranca" element
     */
    boolean isSetNmtipocobranca();
    
    /**
     * Sets the "nmtipocobranca" element
     */
    void setNmtipocobranca(java.lang.String nmtipocobranca);
    
    /**
     * Sets (as xml) the "nmtipocobranca" element
     */
    void xsetNmtipocobranca(org.apache.xmlbeans.XmlString nmtipocobranca);
    
    /**
     * Unsets the "nmtipocobranca" element
     */
    void unsetNmtipocobranca();
    
    /**
     * A factory class with static methods for creating instances
     * of this type.
     */
    
    public static final class Factory
    {
        public static br.jus.tjsc.www.selo.TipoCobranca newInstance() {
          return (br.jus.tjsc.www.selo.TipoCobranca) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().newInstance( type, null ); }
        
        public static br.jus.tjsc.www.selo.TipoCobranca newInstance(org.apache.xmlbeans.XmlOptions options) {
          return (br.jus.tjsc.www.selo.TipoCobranca) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().newInstance( type, options ); }
        
        /** @param xmlAsString the string value to parse */
        public static br.jus.tjsc.www.selo.TipoCobranca parse(java.lang.String xmlAsString) throws org.apache.xmlbeans.XmlException {
          return (br.jus.tjsc.www.selo.TipoCobranca) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( xmlAsString, type, null ); }
        
        public static br.jus.tjsc.www.selo.TipoCobranca parse(java.lang.String xmlAsString, org.apache.xmlbeans.XmlOptions options) throws org.apache.xmlbeans.XmlException {
          return (br.jus.tjsc.www.selo.TipoCobranca) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( xmlAsString, type, options ); }
        
        /** @param file the file from which to load an xml document */
        public static br.jus.tjsc.www.selo.TipoCobranca parse(java.io.File file) throws org.apache.xmlbeans.XmlException, java.io.IOException {
          return (br.jus.tjsc.www.selo.TipoCobranca) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( file, type, null ); }
        
        public static br.jus.tjsc.www.selo.TipoCobranca parse(java.io.File file, org.apache.xmlbeans.XmlOptions options) throws org.apache.xmlbeans.XmlException, java.io.IOException {
          return (br.jus.tjsc.www.selo.TipoCobranca) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( file, type, options ); }
        
        public static br.jus.tjsc.www.selo.TipoCobranca parse(java.net.URL u) throws org.apache.xmlbeans.XmlException, java.io.IOException {
          return (br.jus.tjsc.www.selo.TipoCobranca) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( u, type, null ); }
        
        public static br.jus.tjsc.www.selo.TipoCobranca parse(java.net.URL u, org.apache.xmlbeans.XmlOptions options) throws org.apache.xmlbeans.XmlException, java.io.IOException {
          return (br.jus.tjsc.www.selo.TipoCobranca) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( u, type, options ); }
        
        public static br.jus.tjsc.www.selo.TipoCobranca parse(java.io.InputStream is) throws org.apache.xmlbeans.XmlException, java.io.IOException {
          return (br.jus.tjsc.www.selo.TipoCobranca) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( is, type, null ); }
        
        public static br.jus.tjsc.www.selo.TipoCobranca parse(java.io.InputStream is, org.apache.xmlbeans.XmlOptions options) throws org.apache.xmlbeans.XmlException, java.io.IOException {
          return (br.jus.tjsc.www.selo.TipoCobranca) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( is, type, options ); }
        
        public static br.jus.tjsc.www.selo.TipoCobranca parse(java.io.Reader r) throws org.apache.xmlbeans.XmlException, java.io.IOException {
          return (br.jus.tjsc.www.selo.TipoCobranca) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( r, type, null ); }
        
        public static br.jus.tjsc.www.selo.TipoCobranca parse(java.io.Reader r, org.apache.xmlbeans.XmlOptions options) throws org.apache.xmlbeans.XmlException, java.io.IOException {
          return (br.jus.tjsc.www.selo.TipoCobranca) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( r, type, options ); }
        
        public static br.jus.tjsc.www.selo.TipoCobranca parse(javax.xml.stream.XMLStreamReader sr) throws org.apache.xmlbeans.XmlException {
          return (br.jus.tjsc.www.selo.TipoCobranca) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( sr, type, null ); }
        
        public static br.jus.tjsc.www.selo.TipoCobranca parse(javax.xml.stream.XMLStreamReader sr, org.apache.xmlbeans.XmlOptions options) throws org.apache.xmlbeans.XmlException {
          return (br.jus.tjsc.www.selo.TipoCobranca) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( sr, type, options ); }
        
        public static br.jus.tjsc.www.selo.TipoCobranca parse(org.w3c.dom.Node node) throws org.apache.xmlbeans.XmlException {
          return (br.jus.tjsc.www.selo.TipoCobranca) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( node, type, null ); }
        
        public static br.jus.tjsc.www.selo.TipoCobranca parse(org.w3c.dom.Node node, org.apache.xmlbeans.XmlOptions options) throws org.apache.xmlbeans.XmlException {
          return (br.jus.tjsc.www.selo.TipoCobranca) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( node, type, options ); }
        
        /** @deprecated {@link org.apache.xmlbeans.xml.stream.XMLInputStream} */
        public static br.jus.tjsc.www.selo.TipoCobranca parse(org.apache.xmlbeans.xml.stream.XMLInputStream xis) throws org.apache.xmlbeans.XmlException, org.apache.xmlbeans.xml.stream.XMLStreamException {
          return (br.jus.tjsc.www.selo.TipoCobranca) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( xis, type, null ); }
        
        /** @deprecated {@link org.apache.xmlbeans.xml.stream.XMLInputStream} */
        public static br.jus.tjsc.www.selo.TipoCobranca parse(org.apache.xmlbeans.xml.stream.XMLInputStream xis, org.apache.xmlbeans.XmlOptions options) throws org.apache.xmlbeans.XmlException, org.apache.xmlbeans.xml.stream.XMLStreamException {
          return (br.jus.tjsc.www.selo.TipoCobranca) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( xis, type, options ); }
        
        /** @deprecated {@link org.apache.xmlbeans.xml.stream.XMLInputStream} */
        public static org.apache.xmlbeans.xml.stream.XMLInputStream newValidatingXMLInputStream(org.apache.xmlbeans.xml.stream.XMLInputStream xis) throws org.apache.xmlbeans.XmlException, org.apache.xmlbeans.xml.stream.XMLStreamException {
          return org.apache.xmlbeans.XmlBeans.getContextTypeLoader().newValidatingXMLInputStream( xis, type, null ); }
        
        /** @deprecated {@link org.apache.xmlbeans.xml.stream.XMLInputStream} */
        public static org.apache.xmlbeans.xml.stream.XMLInputStream newValidatingXMLInputStream(org.apache.xmlbeans.xml.stream.XMLInputStream xis, org.apache.xmlbeans.XmlOptions options) throws org.apache.xmlbeans.XmlException, org.apache.xmlbeans.xml.stream.XMLStreamException {
          return org.apache.xmlbeans.XmlBeans.getContextTypeLoader().newValidatingXMLInputStream( xis, type, options ); }
        
        private Factory() { } // No instance of this class allowed
    }
}
